package com.SpringServer.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MachineInfoDTO {

    private String machineNumber;
    private Timestamp timestamp;
    private double temperature;
    private int count;


}
