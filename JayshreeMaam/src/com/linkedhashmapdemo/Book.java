package com.linkedhashmapdemo;


public class Book {

	int bookid;
	String bookname;
	String bookauthor;
	public Book(int bookid, String bookname, String bookauthor) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + "]";
	}
	
	@Override
	public int hashCode()
	{
		return bookid;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Book b= (Book) obj;
		if(this.bookid==b.bookid && this.bookname==b.bookname && this.bookauthor==b.bookauthor)
			return true;
		else
			return false;
	}

}
