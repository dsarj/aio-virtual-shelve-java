package com.aio.virtualshelve.controller;

import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.services.interfaces.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<BookDto> index() {
        //  todo find all methods
        BookDto retorno = new BookDto();
        retorno.setName("A Caminhada");
        retorno.setAuthor("Davi o Grande");
        retorno.setStartYear(2021L);
        retorno.setFinishYear(2022L);

        return ResponseEntity.ok(retorno);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> findById(@PathVariable Long id) {
        log.debug("init - BookController getBookById");
        BookDto bookDto = bookService.findById(id);
        log.debug("finish - BookController getBookById");
        return ResponseEntity.ok(bookDto);
    }

    @PostMapping
    public ResponseEntity<BookDto> save(BookDto bookDto) {
        log.debug("init - BookController save");
        BookDto bookSavedDTO = bookService.save(bookDto);
        log.debug("finish - BookController save");
        return ResponseEntity.ok(bookSavedDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDto> update(Long bookId, BookDto bookDto) {
        log.debug("init - BookController update");
        log.debug("finish - BookController update");
        return ResponseEntity.ok(new BookDto());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<BookDto> delete(Long bookId) {
        log.debug("init - BookController delete");
        // dele
        log.debug("finish - BookController delete");

        return ResponseEntity.ok(new BookDto());
    }


}
