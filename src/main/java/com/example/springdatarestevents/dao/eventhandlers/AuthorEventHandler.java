package com.example.springdatarestevents.dao.eventhandlers;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.example.springdatarestevents.beans.Author;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RepositoryEventHandler(Author.class)
public class AuthorEventHandler {

	@HandleBeforeCreate
	public void handleBeforeCreate(Author author) {
		log.info("Before creation handle: " + author);
	}

	@HandleBeforeSave
	public void handleBeforeSave(Author author) {
		log.info("Before save/update handle: " + author);
	}

	@HandleBeforeDelete
	public void handleBeforeDelete(Author author) {
		log.info("Before deleting handle: " + author);
	}

	@HandleAfterCreate
	public void handleAfterCreate(Author author) {
		log.info("After creation handle: " + author);
	}

}
