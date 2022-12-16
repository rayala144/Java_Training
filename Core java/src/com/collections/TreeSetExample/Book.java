package com.collections.TreeSetExample;

public class Book {
	
	int bookID;
	String bookName;
	int bookPrice;
	
	public Book(int bookID, String bookname, int bookPrice) {
		super();
		this.bookID = bookID;
		this.bookName = bookname;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	

}
