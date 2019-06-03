package com.studentmedicalfacilitator.Service;

import com.studentmedicalfacilitator.DAO.StudentDao;
import com.studentmedicalfacilitator.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/*
    TODO Update the business logic
 */
@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("Mysql") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    public List<Student> returnAllStudents(){
        return studentDao.returnAllStudents();
    }

    public Optional<Student> selectStudentById(int id) {
        return studentDao.selectStudentById(id);
    }

    public int deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    public int updateStudentById(int id, Student updatedStudent) {
        return studentDao.updateStudentById(id, updatedStudent);
    }
}
