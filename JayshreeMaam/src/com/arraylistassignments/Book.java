package com.arraylistassignments;

public class Book {
	int bookId;
	String bookName;
	String authorName;
	double price;
	
	public Book()
	{
		bookId=0;
		bookName="";
		authorName="";
		price=0;
	}
	
	public Book(int bookId, String bookName, String authorName, double price)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.price=price;
	}

	public int getBookId() 
	{
		return bookId;
	}

	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}

	public String getAuthorName() 
	{
		return authorName;
	}

	public void setAuthorName(String authorName) 
	{
		this.authorName = authorName;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	
	public String toString() 
	{
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price+ "]";
	}
	
	
	

}
