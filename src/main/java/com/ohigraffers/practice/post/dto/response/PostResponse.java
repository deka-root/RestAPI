package com.ohigraffers.practice.post.dto.response;

import com.ohigraffers.practice.post.model.Post;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class PostResponse {

    private Long code;

    private String title;

    private String content;

    private String writer;

    @Past(message = "등록일자는 현재보다 과거 날짜가 입력 되어야 합니다.")
    private LocalDateTime createdAt;

    @Future(message = "수정일자는 현재보다 과거 날짜면 안됩니다.")
    private LocalDateTime modifiedAt;

    public static PostResponse from(Post post) {
        return new PostResponse(
                post.getCode(),
                post.getTitle(),
                post.getContent(),
                post.getWriter(),
                post.getCreatedAt(),
                post.getModifiedAt()
        );
    }
}
