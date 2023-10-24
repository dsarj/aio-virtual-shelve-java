package com.aio.virtualshelve.controller;

import com.aio.virtualshelve.dto.BookDto;
import com.aio.virtualshelve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService service;


    @GetMapping("{id}")
    public ResponseEntity<BookDto> getBook(@PathVariable Long idBook) {

        BookDto retorno = new BookDto();
        retorno.setAuthor("James C");
        retorno.setName("Alegoria da terra");

        return ResponseEntity.ok(retorno);
    }

    @PostMapping
    public ResponseEntity<BookDto> save(@RequestBody BookDto dto) {

        BookDto bookSaved = service.save(dto);

        return ResponseEntity.ok(bookSaved);
    }
}
