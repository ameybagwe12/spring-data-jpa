package com.amey.demo;

import com.amey.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JPA REPO (PRIMARY KEY IS AN INTEGER)
// JPA - JAVA PERSISTENCE API FOR DATABASE ACCESS WTIH HIBERNATE ORM
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
