package com.juaracoding.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.juaracoding.main.entity.Book;
import com.juaracoding.main.service.BookService;


public class PerpustakaanController {
	@Autowired
	private BookService bookService;

	

	@GetMapping("/getBook")
	public List<Book> findAllBook(){
		return bookService.getBook();
	}
	
	
	@GetMapping("/getBook/{id}")
	public Book findBookById(@PathVariable Long id) {
		return bookService.getBookById(id);
	}
	
	@GetMapping("/getProductByAuthor/{author}")
	public Book findBookByAuthor(@PathVariable String author) {
		return bookService.getBookByAuthor(author);
	}
	
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable Long id) {
		return bookService.deleteBook(id);
	}
	
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
}
