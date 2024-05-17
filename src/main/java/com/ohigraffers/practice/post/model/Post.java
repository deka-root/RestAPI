package com.ohigraffers.practice.post.model;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class Post {

    private Long code;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Post(Long code, String title, String content, String writer) {
        this.code = code;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createdAt = LocalDateTime.now();
    }

    public void modifyTitleAndContent(String title, String content) {
        this.title = title;
        this.content = content;
        this.modifiedAt = LocalDateTime.now();
    }
}
