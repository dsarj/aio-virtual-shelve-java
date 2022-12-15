package com.aio.virtualshelve.controller;

import com.aio.virtualshelve.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public ResponseEntity<BookDto> index() {
        BookDto retorno = new BookDto();
        retorno.setName("A Caminhada");
        retorno.setAuthor("Davi o Grande");
        retorno.setStartYear(2021L);
        retorno.setFinishYear(2022L);

        return ResponseEntity.ok(retorno);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable Long id) {
        BookDto retorno = new BookDto();
        retorno.setName("A Caminhada");
        retorno.setAuthor("Davi o Grande");
        retorno.setStartYear(2021L);
        retorno.setFinishYear(2022L);

        return ResponseEntity.ok(retorno);
    }

    @PostMapping
    public ResponseEntity<BookDto> save(BookDto bookDto) {
        return ResponseEntity.ok(new BookDto());
    }

    @PutMapping
    public ResponseEntity<BookDto> update(Long bookId, BookDto bookDto) {
        return ResponseEntity.ok(new BookDto());
    }

    @DeleteMapping
    public ResponseEntity<BookDto> delete(Long bookId, BookDto bookDto) {
        return ResponseEntity.ok(new BookDto());
    }


}
