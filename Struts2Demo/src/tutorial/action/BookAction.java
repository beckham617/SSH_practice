/* @(#)BookAction.java v0.9 2008-7-28 下午02:00:38 
 * 
 * 本程序(包括源代码和二进制码)的知识产权(包括但不限于著作权、专利申请权、商标权、专有技术)的所有权、使用权、
 * 转让权以及收益等一切权利均属于ISoftStone所有。
 * Copyright(c) ISoftStone Informaion Service Co.Ltd,2001 - 2008
 * ==============================================================================================================*/
package tutorial.action;
import java.util.Collection;
import tutorial.dao.BookDao;
import tutorial.model.Book;
import com.opensymphony.xwork2.ActionSupport;
/**
 * <p>Class description goes here.</p>
 * 
 * @see    java.lang.Object
 * @author xttao3@isoftstone.com
 */
public class BookAction extends ActionSupport {
    private static final long serialVersionUID = 872316812305356L;
    
    private String isbn;
    private String[] isbns;
    private Book book;
    private Collection<Book> books;
    private BookDao dao =  BookDao.getInstance();
        
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getIsbns() {
        return isbns;
    }

    public void setIsbns(String[] isbns) {
        this.isbns = isbns;
    }
        
    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public String load() {
        book = dao.getBook(isbn);
        return SUCCESS;
    }

    public String list() {
        books = dao.getBooks();
        return SUCCESS;
    }
        
    public String store() {
        dao.storeBook(book);
        return SUCCESS;
    }
    
    public String remove() {
        if(null != isbn) {
            dao.removeBook(isbn);
        } else {
            dao.removeBooks(isbns);
        }
        return SUCCESS;
    }
}