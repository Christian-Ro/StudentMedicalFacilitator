package com.studentmedicalfacilitator.DAO;

import com.studentmedicalfacilitator.Models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao{

    int insertStudent(Student student);

    List<Student> returnAllStudents();

    Optional<Student> selectStudentById(int id);

    int deleteStudentById(int id);

    int updateStudentById(int id, Student student);
}
