package com.aio.virtualshelve.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BookDto {

    private String name;
    private String author;
    private Long startYear;
    private Long finishYear;

}
