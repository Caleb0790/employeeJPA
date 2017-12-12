package employee.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public MyService() {
		System.out.println("MyService");
	}
	
	public void doTheJob(String job) {
		System.out.println(job);
	}
	
	
}
