package com.aio.virtualshelve.repository;

import com.aio.virtualshelve.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthotRepository extends JpaRepository<Author, Long> {
}
