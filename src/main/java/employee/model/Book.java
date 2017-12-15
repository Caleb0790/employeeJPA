package employee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="book")
public class Book {
	
	@Id
	private int id;
	@Column
	private String title;
	@Column(name="nb_pages")
	private int nbPages;
	@Column
	private String author;
	@Column
	@Temporal(TemporalType.DATE)
	private Date publication_date;
	
	
	public Book() {
		super();
	}
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
