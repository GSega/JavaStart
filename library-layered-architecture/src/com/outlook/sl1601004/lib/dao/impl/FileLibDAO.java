package com.outlook.sl1601004.lib.dao.impl;

import java.util.List;

import com.outlook.sl1601004.lib.dao.LibDAO;
import com.outlook.sl1601004.lib.entity.Book;
//класс работы с файлом books.txt
public class FileLibDAO implements LibDAO{

	@Override
	public void add(Book b) { //добавить в конец файла books.txt строку с инфо о книге
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Book b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> find(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book find(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
