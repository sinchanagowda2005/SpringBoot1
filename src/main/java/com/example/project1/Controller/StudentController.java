package com.example.project1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Service.StudentService;
import com.example.project1.dto.request.StudentRequest;
import com.example.project1.dto.response.ApiResponse;
import com.example.project1.dto.response.StudentResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/students")

public class StudentController {
    
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping("/calc")
    public ApiResponse getResults(@RequestBody StudentRequest request){
        StudentResponse result = studentService.calStudentResponse(request);
        return new ApiResponse("Success", result);
    }
    
}
