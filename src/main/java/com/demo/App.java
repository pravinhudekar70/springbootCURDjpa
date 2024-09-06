package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(App.class, args);
		 
		 StudentService sv = context.getBean(StudentService.class);
//		 
//		 Student s = new Student();
//		 s.setSname("teja Rathaod");
//		 s.setScity("Baramati");
//		 s.setSpercentage(67.00);
//		 System.out.println(sv.save(s));
//		 System.out.println(sv.findById(1));
		
		for(Student s1:sv.findAll()) {
			System.out.println(s1);
		}
		 
		 
		//System.out.println( sv.m1(4));
		 
//		 Student s = sv.m2(3, "rahul jadhav");
//		 System.out.println(s);
//		 
//		 for(Student s1 : sv.m3(5, "Nagpur")) {
//			 System.out.println(s1);
//		 }
		 
		 for(Student s:sv.finddByAny("Nagpur")) {
			 System.out.println(s);
		 }
		 
	}

}
