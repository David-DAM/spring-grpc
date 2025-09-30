package com.davinchicoder.springgrpc;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {

    private Long id;
    private String title;
    private String content;
    private String author;
    private String imageUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
