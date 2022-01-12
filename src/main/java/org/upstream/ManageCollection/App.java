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
       
       String firstElement = books.element().getNomBook();
       System.out.println("first element "+firstElement);
		
	   String element1 = books.remove().getNomBook();
	   System.out.println("element1 "+element1);
		 

      
       String Element = books.element().getNomBook();
       System.out.println("element "+Element);
       

       
       
       books.add(new Book(4, "motivation"));
      
       
       System.out.println("************elements****************  ");
       for(Book element : books) {
    	    System.out.println(element.getNomBook());
    	}
       
    }
}
