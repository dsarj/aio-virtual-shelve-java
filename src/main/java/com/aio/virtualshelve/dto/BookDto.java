package com.aio.virtualshelve.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookDto implements Serializable {

    private String author;
    private String name;
    private Long pages;
    private Long startYear;
    private Long finishYear;
    private String authorName;
}
