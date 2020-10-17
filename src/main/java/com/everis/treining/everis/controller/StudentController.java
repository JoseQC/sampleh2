package com.everis.treining.everis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.treining.everis.entity.Student;
import com.everis.treining.everis.service.StudentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/list")
	public List<Student> obtenerLista() throws Exception {
		return studentService.getAll();
	}

	@PostMapping("/add")
	public ResponseEntity<?> save(@RequestBody Student student) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(studentService.save(student));
	}

}
