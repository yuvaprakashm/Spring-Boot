package com.spring.repository;

import org.springframework.data.repository.CrudRepository;
import com.spring.model.Books;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer> {
}
