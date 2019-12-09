package com.example.springdatarestevents.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springdatarestevents.beans.Author;

@RepositoryRestResource(collectionResourceRel = "author", path = "author")
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
