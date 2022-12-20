package com.aio.virtualshelve.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Book {

    private Long id;
    private String name;
    private String author;
    private Long startYear;
    private Long finishYear;
    private Boolean queue;
}
