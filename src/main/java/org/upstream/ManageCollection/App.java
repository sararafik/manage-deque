package org.upstream.ManageCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.upstream.ManageCollection.model.Book;

public class App 
{
    public static void main( String[] args )
    {
    	Queue<Book> books = new PriorityQueue<Book>();
    	books.add(new Book(1, "politique"));
        books.add(new Book(2, "cuisine"));
        books.add(new Book(3, "culture"));
        for(Book element : books) {
    	    System.out.println(element);
    	}
        System.out.println("first element :"+books.peek());
        System.out.println("first element a supprimer :"+books.poll());
        System.out.println("*******elements queue after deleting **********");
        for(Book element : books) {
    	    System.out.println(element);
    	}
    	
    	
		
       
    }
}
