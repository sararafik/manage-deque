package org.upstream.ManageCollection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;
import org.upstream.ManageCollection.model.Book;



public class CollectionTest {
	
	@Test
	void testWithQueue() {
	   Queue<Book> books = new ArrayDeque<Book>();
       books.add(new Book(1, "politique"));
       books.add(new Book(2, "cuisine"));
       books.add(new Book(3, "culture"));
	   assertEquals(books.element().getNomBook(), "politique");
	   assertEquals(books.remove().getNomBook(), "politique");
	   assertEquals(books.element().getNomBook(), "cuisine");
	   
	}
	
	@Test
	void testWithDeque() {
		Deque<Book> books = new ArrayDeque<Book>();
        books.push(new Book(1, "nature"));
        books.push(new Book(2, "guerre"));
        books.push(new Book(3, "medecine"));
        assertEquals(books.peek().getNomBook(), "medecine");   
        assertEquals(books.pop().getNomBook(), "medecine");
        assertEquals(books.peek().getNomBook(), "guerre");
	}
	
	@Test
	void testWithPriorityQueue() {
		  Queue<Book> books = new PriorityQueue<Book>(); 
		  books.add(new Book(1,"politique")); 
		  books.add(new Book(2, "nature")); 
		  books.add(new Book(3,"culture"));
		  assertEquals(books.peek().getNomBook(), "culture");
		  assertEquals(books.poll().getNomBook(), "culture");
		  assertEquals(books.peek().getNomBook(), "nature");
	}

}
