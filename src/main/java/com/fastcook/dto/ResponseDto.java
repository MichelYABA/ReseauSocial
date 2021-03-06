package com.fastcook.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ResponseDto {
    @NotNull
    @NotEmpty
    private String response;
}
