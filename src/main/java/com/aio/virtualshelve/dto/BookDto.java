package com.aio.virtualshelve.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BookDto {

    private Long id;
    private String name;
    private String author;
    private Long startYear;
    private Long finishYear;
    private Boolean queue;

}
