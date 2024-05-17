package com.ohigraffers.practice.common.exception.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ErrorResponse {

    private String code;
    private String description;
    private String detail;

}
