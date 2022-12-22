package com.aio.virtualshelve.repository;

import com.aio.virtualshelve.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
