package com.revature.service;

import com.revature.dao.BookDao;
import com.revature.dao.DAO;
import com.revature.pojos.Book;

import java.util.List;

public class BookService {
	
	static DAO<Book, Integer> bookDao = new BookDao();
	
	public List<Book> getAllBooks() {
		
		List<Book> books = bookDao.findAll();
		
		if(books.size() == 0) return null;
		return books;
	}

}
