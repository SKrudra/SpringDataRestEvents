package com.example.springdatarestevents.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatarestevents.beans.Book;
import com.example.springdatarestevents.services.BookService;

@RestController
public class BookResource {

	@Autowired
	private BookService bookService;

	@GetMapping("books")
	public List<Book> getAll() {
		return bookService.getAllBooks();
	}
}
