package com.studentmedicalfacilitator.DAO;

import com.studentmedicalfacilitator.Models.Student;

import java.util.List;
import java.util.Random;

public interface StudentDao {

    int insertStudent(int id, Student student);

    //TODO check for a better way to assign a unique id to a student instead of using a random number
    default int insertStudent(Student student) {
        Random r = new Random();
        int id = r.nextInt(100);
        return insertStudent(id, student);
    }

    List<Student> returnAllStudents();
}
