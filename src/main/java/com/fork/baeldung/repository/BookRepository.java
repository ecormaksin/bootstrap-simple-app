package com.fork.baeldung.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fork.baeldung.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findByTitle(String title);
}
