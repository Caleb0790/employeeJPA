package employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import employee.dao.BookDAO;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		MyController myController = context.getBean(MyController.class);
//		myController.doTheJob("Hello from the other siiiide!");
//		myController.get();
//		myController.delete();
		
		BookDAO bookdao= context.getBean(BookDAO.class);
		
		//Affiche combien de livre dans la table book
		System.out.println("There is "+ bookdao.getCount()+ " books in the database!");
		
		
//		//Affiche tout les book
//		List<Book> books= bookdao.getAllBooks();
//		
//		for (Book book : books) {
//			System.out.println(book.toString());
//		}
//		
//		//Supprime un book
//		bookdao.deleteBook(1);
//		
//		//Afficher tout les book
//		books= bookdao.getAllBooks();
//		
//		for (Book book : books) {
//			System.out.println(book.toString());
//		}
//		
//		//Insertion
//		Book b=new Book();
//		b.setTitle("L'histoire de MOI");
//		b.setNbPages(600);
//		b.setPublication_date(new Date());
//		b.setAuthor("Tutu DETUTU");
//		
//		bookdao.insertBook(b);
//		
//		
//		//Afficher tout les book
//		books= bookdao.getAllBooks();
//		
//		for (Book book : books) {
//			System.out.println(book.toString());
//		}
//		
//		//Update 
//		bookdao.updateBook(2,"Yoyo DEYOYO");
//		
//		//Afficher tout les book
//		books= bookdao.getAllBooks();
//		
//		for (Book book : books) {
//			System.out.println(book.toString());
//		}
		
		Book b1= new Book();
		b1.setId(30);
		b1.setTitle("L'histoire de MOI");
		b1.setNbPages(600);
		b1.setPublication_date(new Date());
		b1.setAuthor("Tutu DETUTU");
		
		Book b2= new Book();
		b2.setId(31);
		b2.setTitle("L'histoire de TOI");
		b2.setNbPages(600);
		b2.setPublication_date(new Date());
		b2.setAuthor("Tutu DETUTU");
		
		Book b3= new Book();
		b3.setId(32);
		b3.setTitle("L'histoire de VOUS");
		b3.setNbPages(600);
		b3.setPublication_date(new Date());
		b3.setAuthor("Tutu DETUTU");
		
		bookdao.method1(b1, b2, b3);
		bookdao.method2(b1, b2, b3);
		
		context.close();
	}

}
