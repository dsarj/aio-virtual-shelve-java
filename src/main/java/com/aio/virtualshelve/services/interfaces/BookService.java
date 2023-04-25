package com.aio.virtualshelve.services.interfaces;

import com.aio.virtualshelve.dto.BookDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {

    BookDto save(BookDto bookDto);

    BookDto findById(Long id);

    List<BookDto> findAll();

    BookDto update(BookDto bookDto, Long id);
}
