package com.aio.virtualshelve.services;

import com.aio.virtualshelve.builder.BookBuilder;
import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Book;
import com.aio.virtualshelve.repository.BookRepository;
import com.aio.virtualshelve.services.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto save(final BookDto bookDto) {
        final Book book = BookBuilder.dtoToEntity(bookDto);
        final Book bookSaved = bookRepository.save(book);
        return BookBuilder.entityToDTO(bookSaved);
    }

    @Override
    public BookDto findById(final Long id) {
        final Optional<Book> book = bookRepository.findById(id);
        return book.map(BookBuilder::entityToDTO).orElseThrow();
    }

    @Override
    public List<BookDto> findAll() {
        final List<Book> books = bookRepository.findAll(Sort.by("id"));
        final List<BookDto> bookDtoList = new ArrayList<>();
        books.forEach(b -> {
            bookDtoList.add(BookBuilder.entityToDTO(b));
        });
        return bookDtoList;
    }
}
