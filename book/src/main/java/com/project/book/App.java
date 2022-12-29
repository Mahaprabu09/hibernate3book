package com.project.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.entity.Book;

public class App 
{
    public static void main( String[] args )
    {
        Book b=new Book();
        b.setId(1);
        b.setName("Rich dad poor dad");
        b.setAuthor("Robert T.kiyasaki");
        b.setType("Self development");
        b.setYear(2000);
    	Configuration cf=new Configuration().configure().addAnnotatedClass(Book.class);
    	
    	SessionFactory sf=cf.buildSessionFactory();
    	
    	Session s=sf.openSession();
    	
    	Transaction txn=s.beginTransaction();
    	
    	s.save(b);
    	
    	txn.commit();
         
    }
}
