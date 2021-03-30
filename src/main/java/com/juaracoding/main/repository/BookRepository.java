package com.juaracoding.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.juaracoding.main.entity.Book;

public interface BookRepository extends JpaRepository <Book, Long>{
	
Book findByAuthor(String author);
	
	@Query(value="Select *from book where author = ?1", nativeQuery = true)
	Book findyByAuthor(String author);
	
	
}
