package com.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Book_table")
public class Book {
		
	    @Id
		 
	    @Column(name="book_id")
        private long id;
	    
	    

	    @
	    Column(name="book"
	   	+ "_name")
        
        
        private String title;
	
        
        @Column(name="book_author")


             
	    private String author;
	    @Column(name="book_price")

	    private double price;
	    
	   

	    
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public void setPrice(double price) {
			this.price = price;

		}

		

		
		@OneToOne
		@JoinColumn(name="user_id")
		private User user;
		

		public double getPrice() {
			return price;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			// TODO Auto-generated method stub
			 this.user = user;
		        user.setBook(this);
		        
			

		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", user=" + user
					+ "]";
		}

               
	    
	    
	   
	}