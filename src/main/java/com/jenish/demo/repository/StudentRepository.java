package com.jenish.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenish.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
