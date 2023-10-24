package com.aio.virtualshelve.controller;

import com.aio.virtualshelve.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    public ResponseEntity<String> index() {
        String retorno = "Sucesso";
        return ResponseEntity.ok(retorno);
    }

    @GetMapping("{id}")
    public ResponseEntity<BookDto> getBook(@PathVariable Long idBook) {

        BookDto retorno = new BookDto();
        retorno.setAuthor("James C");
        retorno.setName("Alegoria da terra");
        retorno.setPages("500");

        return ResponseEntity.ok(retorno);
    }

    @PostMapping
    public ResponseEntity<BookDto> save(BookDto dto) {



    }
}
