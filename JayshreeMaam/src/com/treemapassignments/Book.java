package com.treemapassignments;

public class Book implements Comparable<Book>{
	
	int bookid;
	String bookname;
	double bookprice;
	
	public Book(int bookid, String bookname, double bookprice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
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

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

	@Override
	public int compareTo(Book o) 
	{
		
		if(this.bookid>o.bookid)
			return 1;
		else if(this.bookid<o.bookid)
			return -1;
		else
			return 0;
		
	}
	
	
	

}
