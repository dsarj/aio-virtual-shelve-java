package com.aio.virtualshelve.service;

import com.aio.virtualshelve.dto.AuthorDto;
import com.aio.virtualshelve.model.Author;
import com.aio.virtualshelve.repository.AuthotRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthotRepository repository;

    @Override
    public AuthorDto save(AuthorDto dto) {
        Author entity = Author.builder().build();
        BeanUtils.copyProperties(dto, entity);
        Author authorSaved = repository.save(entity);

        AuthorDto dtoSaved = AuthorDto.builder().build();
        BeanUtils.copyProperties(authorSaved, dtoSaved);
        return dtoSaved;
    }
}
