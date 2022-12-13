package com.aio.virtualshelve.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    public ResponseEntity<String> index() {
        String retorno = "Sucesso";
        return ResponseEntity.ok(retorno);
    }
}
