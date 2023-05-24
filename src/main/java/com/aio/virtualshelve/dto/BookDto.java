package com.aio.virtualshelve.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookDto {

    private Long id;
    private String name;
    private String author;
    private Long startYear;
    private Long finishYear;
}
