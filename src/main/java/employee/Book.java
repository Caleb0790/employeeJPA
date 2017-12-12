package employee;

import java.time.LocalDate;
import java.util.Date;

public class Book {
	private int id;
	private String title;
	private int nbPages;
	private String author;
	private Date publication_date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=\"" + title + "\", nbPages=" + nbPages + ", author=" + author + ", date=" + publication_date
				+ "]";
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublication_date() {
		return publication_date;
	}
	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	
	
}
