package com.studentmedicalfacilitator.Service;

import com.studentmedicalfacilitator.DAO.StudentRepository;
import com.studentmedicalfacilitator.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/*
    TODO Update the business logic
 */
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return this.studentRepository.save(student);
    }

    public List<Student> returnAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<com.studentmedicalfacilitator.Entity.Student> selectStudentById(int id) {
        return studentRepository.findById((long) id);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById((long) id);
    }

//    public int updateStudentById(int id, com.studentmedicalfacilitator.Models.Student updatedStudent) {
//        return studentRepository.updateStudentById(id, updatedStudent);
//    }
}
