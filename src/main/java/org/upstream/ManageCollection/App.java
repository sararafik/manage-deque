package org.upstream.ManageCollection;

import java.util.ArrayDeque;
import java.util.Queue;

import org.upstream.ManageCollection.model.Book;

public class App 
{
    public static void main( String[] args )
    {
       Queue<Book> books = new ArrayDeque<Book>();
       books.add(new Book(1, "politique"));
       books.add(new Book(2, "cuisine"));
       books.add(new Book(3, "culture"));
       System.out.println(books.element());
       
      
       
    }
}
