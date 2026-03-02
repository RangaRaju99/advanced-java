package com.lpu.annotations;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="book_table")
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="book_name", unique=true,nullable=false)
	private String name;
	
	@Column(updatable=false)
	private String author;
	
	@CreationTimestamp
	private LocalDateTime created_dateTime;
	
	@UpdateTimestamp
	private LocalDateTime updated_dateTime;
	
	@Enumerated
	private BookType bt;
	
	public Book() {
		
	}
	
	

	public Book(String name, String author,BookType b) {
		super();
		this.name = name;
		this.author = author;
		this.bt=b;
	}



	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreated_dateTime() {
		return created_dateTime;
	}

	
	public LocalDateTime getUpdated_dateTime() {
		return updated_dateTime;
	}

	

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", created_dateTime=" + created_dateTime
				+ ", updated_dateTime=" + updated_dateTime + "]";
	}
	
	

}
