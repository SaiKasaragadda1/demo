package com.gp.demo;



import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.*;
@RestController
public class StudentController {
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello World";
	}
	@GetMapping("/showStudent")
	public Student showStudent() {
		Student s=new Student(1,"Sai","CS",100.0);
		return s;
	}
	@GetMapping("/showAllStudent")
	public List<Student> showAllStudent() {
		Student s=new Student(1,"Sai","CS",100.0);
		Student s1=new Student(2,"gow","CSe",13200.0);
		Student s2=new Student(1,"chakri","CreS",102220.0);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(s);
		studentList.add(s1);
		studentList.add(s2);
		return studentList;
	}
}
