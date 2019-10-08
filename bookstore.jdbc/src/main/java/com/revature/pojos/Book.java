package com.revature.pojos;

public class Book {
	
	private int bookId;
	private String isbn;
	private String title;
	private double price;
	private int genreId;
	private int authorId;
	
	public Book() {}

	public Book(int bookId, String isbn, String title, double price, int genreId, int authorId) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
	
		this.title = title;
		this.price = price;
		this.genreId = genreId;
		this.authorId = authorId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", isbn=" + isbn + ", , title=" + title + ", price="
				+ price + ", genreId=" + genreId + ", authorId=" + authorId + "]";
	}

	
	

}
