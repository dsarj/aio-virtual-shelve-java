package com.aio.virtualshelve.service;

import com.aio.virtualshelve.dto.AuthorDto;
import com.aio.virtualshelve.model.Author;

public interface AuthorService {

    AuthorDto save(AuthorDto dto);
}
