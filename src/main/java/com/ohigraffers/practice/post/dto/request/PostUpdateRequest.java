package com.ohigraffers.practice.post.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/* Swagger 문서화 시 설명 어노테이션 작성 */
public class PostUpdateRequest {

    /* Swagger 문서화 시 설명 어노테이션 작성 */
    /* 필수 값이므로 유효성 검사 어노테이션 작성 */
    @Schema(description = "post제목")
    @NotNull(message = "제목은 반드시 입력 되어야 합니다.")
    @NotBlank(message = "제목은 공백일 수 없습니다.")
    @Size(min = 2, max = 15, message = "2~15자 이내 작성바랍니다.")
    private String title;

    /* Swagger 문서화 시 설명 어노테이션 작성 */
    /* 필수 값이므로 유효성 검사 어노테이션 작성 */
    @Schema(description = "post내용")
    @NotNull(message = "내용은 반드시 입력 되어야 합니다.")
    @NotBlank(message = "내용은 공백일 수 없습니다.")
    @Size(min = 5, max = 30, message = "5~30자 이내 작성바랍니다.")
    private String content;

}
