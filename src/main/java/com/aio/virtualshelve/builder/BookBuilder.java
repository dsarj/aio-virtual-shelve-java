package com.aio.virtualshelve.builder;

import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Author;
import com.aio.virtualshelve.model.Book;

public class BookBuilder {

    Book dtoToEntity(BookDto dto) {
        return Book.builder()
                .pages(dto.getPages())
                .name(dto.getName())
                .author(Author.builder()
                        .name(dto.getAuthorName())
                        .build())
                .finishYear(dto.getFinishYear())
                .startYear(dto.getStartYear())
                .build();
    }

}
