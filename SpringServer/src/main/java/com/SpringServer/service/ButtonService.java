package com.SpringServer.service;

import com.SpringServer.model.dto.ButtonRequest;
import com.SpringServer.model.dto.ButtonResponse;
import com.SpringServer.model.entity.StopReason;
import com.SpringServer.repository.StopRepository;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ButtonService {

    private final GoalService goalService;
    private final DBResetService dbResetService;
    private final String URL = "http://192.168.43.142";
    private final StopRepository stopRepository;

    public void saveStopReason(ButtonRequest request){
        var stopReason = StopReason.builder()
                .operationStopTime(request.getOperationStopTime())
                .operationTime(request.getOperationTime())
                .userName(request.getUserName())
                .reason(request.getReason())
                .nowRate(goalService.calculateNowRate(request.getCount()))
                .build();
        stopRepository.save(stopReason);
    }

    public ButtonResponse controlMachineState(ButtonRequest request){
        RestTemplate restTemplate = new RestTemplate();
        String jsonResponse = null;
        String targetUrl = null;
        String message = null;

        switch (request.getState()) {
            case "stop" -> targetUrl = URL + "/machineOff";
            case "start" -> targetUrl = URL + "/machineOn";
            case "reset" -> targetUrl = URL + "/machineReset";
            default -> throw new IllegalArgumentException("Machine command 실패");
        }

        try {
            jsonResponse = restTemplate.getForObject(targetUrl, String.class);
            JSONObject jsonObject = new JSONObject(jsonResponse);
            message = jsonObject.getString("message");
            if (message.equals("Machine Reset")){
                dbResetService.resetExceptSpecificTable();
            }
            return ButtonResponse.builder()
                    .result(message)
                    .build();
        } catch (RestClientException e) {
            throw new IllegalArgumentException("Machine Response 에러");
        }
    }

}
