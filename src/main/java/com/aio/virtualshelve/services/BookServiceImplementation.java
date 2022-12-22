package com.aio.virtualshelve.services;

import com.aio.virtualshelve.builder.BookBuilder;
import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Book;
import com.aio.virtualshelve.repository.BookRepository;
import com.aio.virtualshelve.services.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public BookDto save(BookDto bookDto) {
        // todo validar campos
        Book book = BookBuilder.dtoToEntity(bookDto);
        Book bookSaved = bookRepository.save(book);
        return BookBuilder.entityToDTO(bookSaved);
    }
}
