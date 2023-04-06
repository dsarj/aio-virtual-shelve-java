package com.aio.virtualshelve.controller;

import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.services.interfaces.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public ResponseEntity<List<BookDto>> index() {
        //  todo find all methods
        List<BookDto> bookDtoList = bookService.findAll();
        return ResponseEntity.ok(bookDtoList);
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
