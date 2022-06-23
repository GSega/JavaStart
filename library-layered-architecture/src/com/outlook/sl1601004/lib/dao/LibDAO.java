package com.outlook.sl1601004.lib.dao;

import java.util.List;

import com.outlook.sl1601004.lib.entity.Book;

public interface LibDAO {
	void add(Book b);
	
	void remove(int bookId);
	
	void remove(Book b);
	
	List<Book> find(String title);
	
	Book find(int bookId);
}
