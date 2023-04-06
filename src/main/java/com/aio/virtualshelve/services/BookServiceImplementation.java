package com.aio.virtualshelve.services;

import com.aio.virtualshelve.builder.BookBuilder;
import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.model.Book;
import com.aio.virtualshelve.repository.BookRepository;
import com.aio.virtualshelve.services.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto save(BookDto bookDto) {
        // todo validar campos
        Book book = BookBuilder.dtoToEntity(bookDto);
        Book bookSaved = bookRepository.save(book);
        return BookBuilder.entityToDTO(bookSaved);
//        return null;
    }

    @Override
    public BookDto findById(Long id) {
//        Optional<Book> book = bookRepository.findById(id);
//        return BookBuilder.entityToDTO(book.get()); //todo ver orelse throw
        return BookBuilder.entityToDTO(Book.builder().id(1L).name("Misterio").build());
//        return BookDto.builder().id(1L).name("Teste").build();
    }

    @Override
    public List<BookDto> findAll() {
//        List<Book> books = bookRepository.findAll(); // todo implement with some Sort
//        List<BookDto> booksDto = new ArrayList<>();
//        for(Book book: books) { // todo melhorar essa estrutura
//            booksDto.add(BookBuilder.entityToDTO(book));
//        }
        return null;
    }
}
