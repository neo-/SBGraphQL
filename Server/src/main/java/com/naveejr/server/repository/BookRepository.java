package com.naveejr.server.repository;

import com.naveejr.server.bo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
