package employee.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import employee.Book;

@Repository
@Transactional
public class BookDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource ds) {
		this.jdbcTemplate=new JdbcTemplate(ds);
		
	}
	
	public int getCount() {
		return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM book", Integer.class); 
	}
	
	public List<Book> getAllBooks(){
		return this.jdbcTemplate.query( "select * from book", new BookMapper());
	}
	
	public void deleteBook(int id) {
		this.jdbcTemplate.update("delete from book where id = ?", id);
	}
	
	public void insertBook(Book b) {
		this.jdbcTemplate.update("insert into book (id, title, nb_pages, author, publication_date) "
								+ "values (?, ?, ?, ?, ?)",b.getId(), b.getTitle(), b.getNbPages(), b.getAuthor(), b.getPublication_date());
	}
	
	public void updateBook(int id, String s) {
		this.jdbcTemplate.update("update book set author = ? where id = ?", s, id);
	}
	
	public void method1(Book b1, Book b2, Book b3) throws InterruptedException {
		insertBook(b1);
		insertBook(b2);
		insertBook(b3);
		Thread.sleep(6000);
		System.out.println("Method 1");
	}
	
	public void method2(Book b1, Book b2, Book b3) throws InterruptedException {
		insertBook(b1);
		insertBook(b2);
		insertBook(b3);
		Thread.sleep(6000);
		System.out.println("Method 2");
	}
}
