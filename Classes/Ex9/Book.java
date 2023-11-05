package Ex9;

import java.time.LocalDate;
import java.util.Arrays;

public class Book {
	private int id;
	private String name;
	private String[] author;
	private int countPages;
	private int price;
	private String publishing;
	private String yearPublishing;
	private String typeBinding;
	
	public Book() {
		super();
	}

	public Book(int id, String name, String[] author, int countPages, int price, String publishing,
			String yearPublishing, String typeBinding) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.countPages = countPages;
		this.price = price;
		this.publishing = publishing;
		this.yearPublishing = yearPublishing;
		this.typeBinding = typeBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public int getCountPages() {
		return countPages;
	}

	public void setCountPages(int countPages) {
		this.countPages = countPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public String getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(String yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public String getTypeBinding() {
		return typeBinding;
	}

	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + Arrays.toString(author) + ", countPages=" + countPages + ", price="
				+ price + ", publishing=" + publishing + ", yearPublishing=" + yearPublishing + ", typeBinding="
				+ typeBinding + "]";
	}

}
