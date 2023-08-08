//package com.SpringServer.controller;
//
//
//import com.SpringServer.model.dto.CountDTO;
//import com.SpringServer.model.dto.TimesDTO;
//import com.SpringServer.service.WebSocketService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/display")
//public class DisplayController {
//
//    @Autowired
//    private WebSocketService webSocketService;
//
//    @GetMapping("/operationtime")
//    public ResponseEntity<TimesDTO> getOperationTime() {
//        return ResponseEntity.ok(webSocketService.getOperationTime());
//    }
//
//    @GetMapping("/count")
//    public ResponseEntity<CountDTO> getCount(){
//        return ResponseEntity.ok(webSocketService.getCount());
//    }
//
//
//
//
//}
