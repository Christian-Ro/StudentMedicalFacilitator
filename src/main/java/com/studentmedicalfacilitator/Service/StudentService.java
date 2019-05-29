package com.studentmedicalfacilitator.Service;

import com.studentmedicalfacilitator.DAO.StudentDao;
import com.studentmedicalfacilitator.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    public List<Student> returnAllStudents(){
        return studentDao.returnAllStudents();
    }
}
