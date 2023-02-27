package com.naveejr.server.repository;

import com.naveejr.server.bo.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
