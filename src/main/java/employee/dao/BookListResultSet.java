package employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import employee.model.Book;

public class BookListResultSet implements ResultSetExtractor<Book> {

	@Override
	public Book extractData(ResultSet arg0) throws SQLException, DataAccessException {

		return null;
	}

}
