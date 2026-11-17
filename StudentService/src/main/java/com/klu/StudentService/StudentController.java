package com.klu.StudentService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	    @Value("${server.port}")
	    private String port;

	    @GetMapping("/students")
	    public String getStudents() {
	        return "Student Service running on port: " + port;
	    }
	}

