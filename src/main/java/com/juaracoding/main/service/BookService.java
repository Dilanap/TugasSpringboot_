package com.juaracoding.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.main.entity.Book;
import com.juaracoding.main.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> saveBook(List<Book> book){
		return bookRepository.saveAll(book);
	}
	
	public List<Book> getBook(){
		return bookRepository.findAll();
	}

	public Book getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	public Book getBookByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}
	
	
	
	public Book updateBook(Book book) {
		Book existingBook= bookRepository.findById(book.getId()).orElse(null);
		existingBook.setAuthor(book.getAuthor());
		existingBook.setIsbn(book.getIsbn());
		existingBook.setTitle(book.getTitle());
		return bookRepository.save(existingBook);
	}
	

	public String deleteBook(Long id) {
		bookRepository.deleteById(id);
		return "Book di delete";
	}
	
}
	
	
	
	

