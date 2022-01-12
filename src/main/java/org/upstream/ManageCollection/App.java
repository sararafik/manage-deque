package org.upstream.ManageCollection;

import java.util.ArrayDeque;
import java.util.Deque;


import org.upstream.ManageCollection.model.Book;

public class App 
{
    public static void main( String[] args )
    {
       Deque<Book> books = new ArrayDeque<Book>();
       books.push(new Book(1, "nature"));
       books.push(new Book(2, "guerre"));
       books.push(new Book(3, "medecine"));
       System.out.println("peek  " +books.peek().getNomBook());
       System.out.println("pop   " +books.pop().getNomBook());
       System.out.println("peek  " +books.peek().getNomBook());
       for(Book element : books) {
   	    System.out.println(element);
   	   }
      
       
    }
}
