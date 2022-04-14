package com.jjeanjacques.digimon.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DigimonDTO {
    private Long id;
    private String name;
    private Integer power;
}
