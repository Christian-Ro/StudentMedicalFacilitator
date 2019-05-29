package com.studentmedicalfacilitator.Controller;

import com.studentmedicalfacilitator.Models.Student;
import com.studentmedicalfacilitator.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> returnAllStudents(){
        return studentService.returnAllStudents();
    }

    //TODO return a 404 or something  for user not found
    @GetMapping(path = "/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.selectStudentById(id).orElse(null);
    }
}
