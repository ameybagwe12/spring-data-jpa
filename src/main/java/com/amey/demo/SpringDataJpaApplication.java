package com.amey.demo;

import com.amey.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		// CREATING BEAN OF STUDENT-REPO INTERFACE
		StudentRepo repo = context.getBean(StudentRepo.class);

		s1.setRollNo(9180);
		s1.setName("Amey");
		s1.setMarks(80);

		s2.setRollNo(9182);
		s2.setName("Abhay");
		s2.setMarks(75);

		s3.setRollNo(9183);
		s3.setName("Himanshu");
		s3.setMarks(90);

		// SAVING DATA IN PG ADMIN (INSERT OPERATION)
		repo.save(s2);
		repo.save(s3);
		repo.save(s1);

		// FETCHING THE DATA
		System.out.println(repo.findAll());
		// FETCHING BASED OF P_KEY (O/P ELSE EMPTY)
		System.out.println(repo.findById(9184));

	}

}
