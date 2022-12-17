package com.aio.virtualshelve.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    private Long id;
    private String name;
    private String author;
    private Long startYear;
    private Long finishYear;
    private Boolean queue;
}
