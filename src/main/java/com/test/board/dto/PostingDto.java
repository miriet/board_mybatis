package com.test.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostingDto {
    private Long id;
    private String title;
    private String content;
    private int viewCount;
    private String CreatedBy;
    private LocalDateTime CreatedDate;
}
