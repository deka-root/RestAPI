package com.ohigraffers.practice.post.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
@Schema(description = "응답 메세지")
public class ResponseMessage {

    @Schema(description = "HTTP 상태 코드")
    private int httpStatus;
    @Schema(description = "응답 메세지")
    private String message;
    @Schema(description = "응답 데이터")
    private Map<String, Object> results;

}
