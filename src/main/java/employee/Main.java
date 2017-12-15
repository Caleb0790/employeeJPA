package employee;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import employee.dao.BookDAO;
import employee.model.Book;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		
		BookDAO bookdao= context.getBean(BookDAO.class);
		
		
		Book b1= new Book();
		b1.setId(30);
		b1.setTitle("L'histoire de MOI");
		b1.setNbPages(600);
		b1.setPublication_date(new Date());
		b1.setAuthor("Tutu DETUTU");
		
		//bookdao.persist(b1);
		bookdao.remove(b1);
		
		
//		Book b2= new Book();
//		b2.setId(31);
//		b2.setTitle("L'histoire de TOI");
//		b2.setNbPages(600);
//		b2.setPublication_date(new Date());
//		b2.setAuthor("Tutu DETUTU");
//		
//		Book b3= new Book();
//		b3.setId(32);
//		b3.setTitle("L'histoire de VOUS");
//		b3.setNbPages(600);
//		b3.setPublication_date(new Date());
//		b3.setAuthor("Tutu DETUTU");
		

		
		context.close();
	}

}
