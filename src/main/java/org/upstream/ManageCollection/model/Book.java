package org.upstream.ManageCollection.model;

public class Book implements Comparable<Book>{
	private int identifiantBook;
	private String nomBook;
	public int getIdentifiantBook() {
		return identifiantBook;
	}
	public void setIdentifiantBook(int identifiantBook) {
		this.identifiantBook = identifiantBook;
	}
	public String getNomBook() {
		return nomBook;
	}
	public void setNomBook(String nomBook) {
		this.nomBook = nomBook;
	}
	public Book(int identifiantBook, String nomBook) {
		super();
		this.identifiantBook = identifiantBook;
		this.nomBook = nomBook;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [identifiantBook=" + identifiantBook + ", nomBook=" + nomBook + "]";
	}
	public int compareTo(Book o) {
		
		return this.nomBook.compareTo(o.nomBook);
		
	}
	
	
	
	
	

}
