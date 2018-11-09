/* @(#)BookDao.java v0.9 2008-7-28 下午01:58:34 
 * 
 * 本程序(包括源代码和二进制码)的知识产权(包括但不限于著作权、专利申请权、商标权、专有技术)的所有权、使用权、
 * 转让权以及收益等一切权利均属于ISoftStone所有。
 * Copyright(c) ISoftStone Informaion Service Co.Ltd,2001 - 2008
 * ==============================================================================================================*/
package tutorial.dao;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tutorial.model.Book;
/**
 * <p>Class description goes here.</p>
 * 
 * @see    java.lang.Object
 * @author xttao3@isoftstone.com
 */
public class BookDao {
    private static final BookDao instance;
    private static final ConcurrentMap<String, Book> data;
    
    static {
        instance = new BookDao();
        data = new ConcurrentHashMap<String, Book>();
        data.put("978-0735619678", new Book("978-0735619678", "Code Complete, Second Edition", 32.99));
        data.put("978-0596007867", new Book("978-0596007867", "The Art of Project Management", 35.96));
        data.put("978-0201633610", new Book("978-0201633610", "Design Patterns: Elements of Reusable Object-Oriented Software", 43.19));
        data.put("978-0596527341", new Book("978-0596527341", "Information Architecture for the World Wide Web: Designing Large-Scale Web Sites", 25.19));
        data.put("978-0735605350", new Book("978-0735605350", "Software Estimation: Demystifying the Black Art", 25.19));
    }
    
    private BookDao() {}
    
    public static BookDao getInstance() {
        return instance;
    }
    
    public Collection<Book> getBooks() {
        return data.values();
    }
    
    //
    public Book getBook(String isbn) {
        return data.get(isbn);
    }
    
    public void storeBook(Book book) {
        data.put(book.getIsbn(), book);
    }
        
    public void removeBook(String isbn) {
        data.remove(isbn);
    }
    //删除
    public void removeBooks(String[] isbns) {
        for(String isbn : isbns) {
            data.remove(isbn);
        }
    }
}