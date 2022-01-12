package org.upstream.ManageCollection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.jupiter.api.Test;
import org.upstream.ManageCollection.model.Book;



public class ArrayDequeTest {
	
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

}
