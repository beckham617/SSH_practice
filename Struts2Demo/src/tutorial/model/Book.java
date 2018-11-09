/* @(#)Book.java v0.9 2008-7-28 下午01:59:43 
 * 
 * 本程序(包括源代码和二进制码)的知识产权(包括但不限于著作权、专利申请权、商标权、专有技术)的所有权、使用权、
 * 转让权以及收益等一切权利均属于ISoftStone所有。
 * Copyright(c) ISoftStone Informaion Service Co.Ltd,2001 - 2008
 * ==============================================================================================================*/
package tutorial.model;

/**
 * <p>Class description goes here.</p>
 * 
 * @see    java.lang.Object
 * @author xttao3@isoftstone.com
 */
public class Book {
	private String isbn;
	private String title;
	private double price;

	public Book() {
	}

	public Book(String isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}