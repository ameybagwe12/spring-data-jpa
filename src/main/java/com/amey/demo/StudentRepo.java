package com.amey.demo;

import com.amey.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// JPA REPO (PRIMARY KEY IS AN INTEGER)
// JPA - JAVA PERSISTENCE API FOR DATABASE ACCESS WTIH HIBERNATE ORM
public interface StudentRepo extends JpaRepository<Student, Integer> {
    // THE ?1 -> WILL BE REPLACED BY 1ST PARAMETER
    @Query("select s from Student s where s.name = ?1") // QUERY ANNOTATION FOR JPA QUERY LANGUAGE
    // THE NAME OF INTERFACE METHOD WILL BE USED AS REFERENCE FOR QUERY
    List<Student> findByName(String name);

}
