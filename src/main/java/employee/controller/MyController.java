package employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;

import employee.services.MyService;

@Controller
public class MyController {

	@Autowired
	private MyService myService;
	
	
	
	public MyController() {
		super();
	}

	public void doTheJob(String job) {
		myService.doTheJob("Controller " + job);
	}

	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	public String get() {
		return "Get function ";
	}
	
	public void delete() {
		System.out.println("Delete function");
		try {
			int a=1,b=0;
			int c=a/b;
		} catch (Exception e) {

		}
	}
}
