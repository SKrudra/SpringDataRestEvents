package com.example.springdatarestevents.dao.eventhandlers;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.example.springdatarestevents.beans.Book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RepositoryEventHandler(Book.class)
public class BookEventHandler {

	@HandleBeforeCreate
	public void handleBeforeCreate(Book book) {
		log.info("Before create handler: " + book);
	}
}
