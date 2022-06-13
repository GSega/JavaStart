package com.outlook.sl1601004.main;

public class Book {
	private int id;
	private String title;
	private String authors;
	private String publisher;
	private int year;
	private int quantity;
	private int pages;
	private int price;
	private String binding;

	public Book() {
		this.setId(0);
		this.setTitle("def");
		this.setAuthors("def");
		this.setPublisher("def");
		this.setYear(0);
		this.setQuantity(0);
		this.setPages(0);
		this.setPrice(0);
		this.setBinding("def");
	}

	public Book(String title, String authors, String publisher, int year) {
		this.setTitle(title);
		this.setAuthors(authors);
		this.setPublisher(publisher);
		this.setYear(year);
	}

	public void printShortInfo() {
		System.out.println(title + " by " + authors + ", " + year + ", " + publisher);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", publisher=" + publisher + ", year="
				+ year + ", quantity=" + quantity + ", pages=" + pages + ", price=" + price + ", binding=" + binding
				+ "]";
	}

}
