package com.outlook.sl1601004.main;

public class BookOperations {

	private static String[] getAuthorsAsArray(Book book) {
		String[] authorsArray = book.getAuthors().split(", ");

		return authorsArray;
	}

	public static void printBooksByAuthor(Book[] booksArray, String author) {
		System.out.println("Books written by " + author + ":");
		for (Book b : booksArray) {

			for (String a : getAuthorsAsArray(b)) {
				if (a.equals(author)) {
					b.printShortInfo();
				}
			}
		}
	}

	public static void printBooksByPublisher(Book[] booksArray, String publisher) {
		System.out.println("books published by " + publisher + ":");
		for (Book b : booksArray) {
			if (b.getPublisher().equals(publisher)) {
				b.printShortInfo();
			}
		}
	}

	public static void printBooksAfterYear(Book[] booksArray, int year) {
		System.out.println("Books published aftr year " + year + ":");
		for (Book b : booksArray) {
			if (b.getYear() > year) {
				b.printShortInfo();
			}
		}
	}

}
