package com.Hibernate;



import com.Hibernate.Book;
import com.Hibernate.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
    	public class App {
    	    public static void main(String[] args) {
    	        SessionFactory sessionFactory = new Configuration()
    	                .configure("hibernate.cfg.xml")
    	                .addAnnotatedClass(User.class)
    	                .addAnnotatedClass(Book.class)
    	                .buildSessionFactory();
    	        Session session = sessionFactory.openSession();
    	        
    	        
    	        try {
    	            session.beginTransaction();  
    	            User user = new User();
    	            user.setId(1);
    	            user.setName("roopa");
    	            session.save(user);

    	            Book book = new Book();
    	            book.setId(1);
    	            book.setTitle("dddddd");
    	            book.setAuthor(" Author");
    	            book.setUser(user);
    	            
    	            
    	            Book book1=new Book();
    	            book1.setId(2);
    	            book1.setAuthor("chetu");
    	            book1.setTitle("chettu");
    	            book1.setPrice(400000);
    	   
    	            session.save(book);
    	            session.save(book1);


 /*
    	            String userId = "someUserId";
    	            User user1 = session.get(User.class, userId);
    	            System.out.println("User: " + user.getName());
    	            System.out.println("Books:");
    	            for (Book book1 : user.getBooks()) {
    	                System.out.println(" - " + book.getTitle());
 */   	           // }
    	            session.getTransaction().commit();
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        } finally {
    	            session.close();
    	            sessionFactory.close();
    	        }
    	    }
    	}