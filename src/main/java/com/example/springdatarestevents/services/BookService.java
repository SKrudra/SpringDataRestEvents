package com.example.springdatarestevents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatarestevents.beans.Book;
import com.example.springdatarestevents.doa.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}
}
