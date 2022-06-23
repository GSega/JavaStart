package com.outlook.sl1601004.lib.entity;

public class Book {
	
	String title;
	int id;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book(String title) {
		super();
		this.title = title;
	}

}
