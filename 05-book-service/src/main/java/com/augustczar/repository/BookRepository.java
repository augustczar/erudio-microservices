package com.augustczar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustczar.model.Book;


public interface BookRepository extends JpaRepository<Book, Long>{

}
