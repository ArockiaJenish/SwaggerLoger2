package com.jenish.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenish.demo.exceptions.UserException;
import com.jenish.demo.model.Student;
import com.jenish.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository stuRepo;
	
	Logger logger = LoggerFactory.getLogger(StudentService.class);

	public Student addStudent(Student stu) throws Exception {
		System.out.println(stu);
		if(stu.getName()==null)
			throw new UserException("Student name is null");
		if(stu.getCity()==null)
			throw new UserException("Student city is null");
		if(stu.getEmail()==null)
			throw new UserException("Student email is null");
		
		return stuRepo.save(stu);
	}

	public List<Student> getAllStu() {
		logger.debug("Hello from debug level");
		return stuRepo.findAll();
	}

	public Student updateStudent(Student newStu) {
		Student oldStu = stuRepo.findById(newStu.getId()).get();
		if(newStu.getName()!=null)
			oldStu.setName(newStu.getName());
		if(newStu.getCity()!=null)
			oldStu.setCity(newStu.getCity());
		if(newStu.getEmail()!=null)
			oldStu.setEmail(newStu.getEmail());
		logger.debug("Updated method hitted");
		return stuRepo.save(oldStu);
	}

	public String deleteStudent(int id) {
		stuRepo.deleteById((long) id);
		return "Deleted";
	}

}
