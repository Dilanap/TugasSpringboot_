package com.juaracoding.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.main.entity.Book;

public interface PagesRepository extends JpaRepository <Book, Long>{
	

}