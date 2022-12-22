package com.aio.virtualshelve.builder;

import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Book;
import org.springframework.stereotype.Component;

@Component
public class  BookBuilder {

    public static Book dtoToEntity(BookDto bookDto) {

        return  Book.builder().
                id(bookDto.getId()).
                name(bookDto.getName()).
                author(bookDto.getAuthor()).
                startYear(bookDto.getStartYear()).
                finishYear(bookDto.getFinishYear()).
                queue(bookDto.getQueue()).build();
    }

    public static BookDto entityToDTO(Book book) {
        return BookDto.builder().
                id(book.getId()).
                name(book.getName()).
                author(book.getAuthor()).
                startYear(book.getStartYear()).
                finishYear(book.getFinishYear()).
                queue(book.getQueue()).build();
    }


}
