package Ex9;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		BookBase base = new BookBase(10);
		
		base.add(new Book(320, "War and Peace", new String[]{"Leo Tolstoy"}, 1200, 20, "Penguin", "2010", "Hardcover"), 0);
		base.add(new Book(119, "Crime and Punishment", new String[]{"Fyodor Dostoevsky"}, 400, 15, "Penguin", "2015", "Paperback"), 1);
		base.add(new Book(502, "Harry Potter", new String[]{"J.K. Rowling"}, 320, 25, "Scholastic", "1997", "Hardcover"), 2);
		base.add(new Book(93, "1984", new String[]{"George Orwell"}, 328, 18, "Houghton Mifflin Harcourt", "1949", "Paperback"), 3);
		base.add(new Book(299, "Anna Karenina", new String[]{"Leo Tolstoy"}, 800, 22, "HarperCollins", "2018", "Hardcover"), 4);
		base.add(new Book(456, "The Great Gatsby", new String[]{"F. Scott Fitzgerald"}, 320, 15, "Penguin", "1925", "Paperback"), 5);
		base.add(new Book(789, "To Kill a Mockingbird", new String[]{"Harper Lee"}, 400, 20, "HarperCollins", "1960", "Hardcover"), 6);
		base.add(new Book(480, "Good Omens", new String[]{"Neil Gaiman", "Terry Pratchett"}, 400, 25, "HarperTorch", "1990", "Paperback"), 7);
		base.add(new Book(608, "The Illuminae Files: Illuminae", new String[]{"Amie Kaufman", "Jay Kristoff"}, 608, 30, "Knopf Books for Young Readers", "2015", "Hardcover"), 8);
		base.add(new Book(400, "Neverwhere", new String[]{"Neil Gaiman", "Lenny Henry"}, 400, 25, "HarperCollins", "1996", "Paperback"), 9);
		System.out.println(base);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author: ");
		String inAuthor = scan.nextLine();
		
		Book[] array = base.bookAuthor(inAuthor);
		for (Book book : array) {
			System.out.println(book);
		}
		
		System.out.print("\nInput publish: ");
		String inPublish = scan.nextLine();
		
		Book[] arrayPublish = base.bookPublishing(inPublish);
		for (Book book : arrayPublish) {
			System.out.println(book);
		}
		
		System.out.print("\nInput year: ");
		int years = scan.nextInt();
		Book[] arrayYears = base.bookYears(years);
		for (Book book : arrayYears) {
			System.out.println(book);
		}

		
	}

}
