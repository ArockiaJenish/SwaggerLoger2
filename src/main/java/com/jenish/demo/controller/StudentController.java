package com.jenish.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jenish.demo.model.Student;
import com.jenish.demo.service.StudentService;

@RestController
@RequestMapping("/swag")
public class StudentController {

	@Autowired
	private StudentService stuServ;
	
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping(method=RequestMethod.POST, value="/addStudent")
	public Student addStudent(@RequestBody Student stu) throws Exception {
		return stuServ.addStudent(stu);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getAll")
	public List<Student> getAllStu(){
		logger.debug("Hello from debug controller");
		return stuServ.getAllStu();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateStudent")
	public Student updateStudent(@RequestBody Student stu) {
		return stuServ.updateStudent(stu);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteStudent")
	public String deleteStudetn(@RequestParam("id") int id) {
		return stuServ.deleteStudent(id);
	}
	
}
