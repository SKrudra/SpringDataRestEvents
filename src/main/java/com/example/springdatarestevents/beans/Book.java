package com.example.springdatarestevents.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name = "authorId", nullable = false)
	@JsonBackReference
	private Author author;
}
