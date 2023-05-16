package com.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    @Column(name="user_id")
    private long id;
    @Column(name ="user_name")

    private String name;
    @Column(name ="user_email")
    private String email;

    @OneToOne(mappedBy = "user")
    private Book book;
    
	public long getId() {
		return id;
	}
	public long setId(long i) {
		return this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

		
		
		
		@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", book=" + book + "]";
	}
		public Book getBook() {
			return book;
		}
		// TODO Auto-generated method
		public void setBook(Book book) {
	        this.book = book;
	      
	        
	    }
		
	}