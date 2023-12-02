package com.treemapassignments;

import java.util.Comparator;

import com.arraylistdemos.Employee;

public class BookComparatorName implements Comparator<Book> {


	@Override
	public int compare(Book o1, Book o2) {

			return o1.bookname.compareTo(o2.bookname);
	}
}
