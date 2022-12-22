package com.aio.virtualshelve.services.interfaces;

import com.aio.virtualshelve.dto.BookDto;
import org.springframework.stereotype.Component;

@Component
public interface BookService {

    BookDto save(BookDto bookDto);

    BookDto findById(Long id);
}
