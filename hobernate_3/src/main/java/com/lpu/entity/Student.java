package com.lpu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;



@Table(    // Table name is changed using @Table.
	    name="students",
	    uniqueConstraints=@UniqueConstraint(columnNames={"email","phone"})  
	 // Creates composite unique constraints (multiple columns together must be unique).
	  //  👉 Single uniqueness → Column
	  //  👉 Combination uniqueness → Table
	)
@Entity(name="student_query")  // This changes the entity name used in JPQL query, NOT the table name
public class Student {

	 @Id   // defines the primary key, every entity must have this
	 private int id;
	 
	 @Column(name="email_col")
	 private String email;
	 private long phone;
	 
	 
}
