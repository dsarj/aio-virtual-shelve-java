package com.aio.virtualshelve.service.impl;

import com.aio.virtualshelve.builder.BookBuilder;
import com.aio.virtualshelve.dto.AuthorDto;
import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Book;
import com.aio.virtualshelve.repository.BookRepository;
import com.aio.virtualshelve.service.AuthorService;
import com.aio.virtualshelve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookBuilder builder;

    @Autowired
    BookRepository repository;

    @Autowired
    AuthorService authorService;



    @Override
    public BookDto save(BookDto dto) {

        Book book = builder.dtoToEntity(dto);
        Book bookSaved = repository.save(book);

        return builder.entityToDto(bookSaved);
    }

}
