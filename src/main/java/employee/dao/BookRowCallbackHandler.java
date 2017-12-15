package employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;

import employee.model.Book;

public class BookRowCallbackHandler implements RowCallbackHandler {

    private List<Book> books;
    private List<String> authors;
    
    public BookRowCallbackHandler() {
        books = new ArrayList<Book>();
    }
 
    public void processRow(ResultSet rs) throws SQLException {
		Book b = new Book();
		b.setId(rs.getInt("id"));
		b.setTitle(rs.getString("title"));
		b.setNbPages(rs.getInt("nb_pages"));
		b.setAuthor(rs.getString("author"));
		b.setPublication_date(rs.getDate("publication_date"));
        books.add(b);
    }
     
    public List<Book> getBookList() {
        return books;
    }

}
