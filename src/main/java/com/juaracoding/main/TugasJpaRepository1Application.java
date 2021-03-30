package com.juaracoding.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.juaracoding.main.repository.PagesRepository;
import com.juaracoding.main.repository.BookRepository;
import com.juaracoding.main.entity.Book;
import com.juaracoding.main.entity.Pages;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class TugasJpaRepository1Application implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(TugasJpaRepository1Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	PagesRepository pagesRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		book.setAuthor("Dilaan");
		book.setIsbn("1223342");
		book.setTitle("Dilan 1998");
		
		Pages page=new Pages();
		page.setNumber(192);
		page.setChapter("Chapter 1");
		page.setContent("Happy");
		
		Pages page2=new Pages();
		page2.setNumber(192);
		page2.setChapter("Chapter 1");
		page2.setContent("Happy");
		
		List<Pages> lstpages=new ArrayList<Pages>();
		lstpages.add(page);
		lstpages.add(page2);
		
		book.setPages(lstpages);
		
		this.bookRepository.save(book);
	}

}
