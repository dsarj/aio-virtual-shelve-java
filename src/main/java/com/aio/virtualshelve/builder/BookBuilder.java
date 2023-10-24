package com.aio.virtualshelve.builder;

import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Author;
import com.aio.virtualshelve.model.Book;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BookBuilder {

    public Book dtoToEntity(BookDto dto) {
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

    public BookDto entityToDto(Book entity) {
        return   BookDto.builder()
                .startYear(entity.getStartYear())
                .finishYear(entity.getFinishYear())
                .authorName(Objects.nonNull(entity.getAuthor()) ? entity.getAuthor().getName() : "")
                .pages(entity.getPages())
                .name(entity.getName())
                .build();
    }

}
