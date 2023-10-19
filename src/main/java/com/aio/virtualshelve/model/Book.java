package com.aio.virtualshelve.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book implements Serializable {

    private Long id;
    private String name;
    private Long startYear;
    private Long finishYear;
    private Author author;


}
