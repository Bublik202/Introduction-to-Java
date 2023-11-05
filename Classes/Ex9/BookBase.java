package Ex9;

import java.util.Arrays;
import java.util.Scanner;

public class BookBase {
	Book[] books;

	public BookBase(int size) {
		super();
		this.books = new Book[size];
	}

	public void add(Book book, int index) {
		if(index >= 0 && index < books.length) {
			books[index] = book;
		}
	}
	
	public Book[] bookAuthor(String inAuthor) {	
		Book[] array = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			
			for (String author : book.getAuthor()) {
				if(author.equalsIgnoreCase(inAuthor)) {
					array[i++] = book;
				}						
			}
		}		
		
		return Arrays.copyOf(array, i);
	}
	
	public Book[] bookPublishing(String inPublish) {
		Book[] array = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if(inPublish.equalsIgnoreCase(book.getPublishing())) {
				array[i++] = book;
			}
		}
		
		return Arrays.copyOf(array, i);
	}
	
	public Book[] bookYears(int years) {
		Book[] array = new Book[books.length];
		int i = 0;
		for (Book book : books) {
			if(book != null && Integer.parseInt(book.getYearPublishing()) > years) {
				array[i++] = book;
			}
		}
		return Arrays.copyOf(array, i);
	}
	

	@Override
	public String toString() {
		System.out.println("BookBase: ");
		StringBuilder builder = new StringBuilder("");
		
		for (Book book : books) {
			builder.append(book).append("\n");				
		}
		
		return builder.toString();
	}
	
}
