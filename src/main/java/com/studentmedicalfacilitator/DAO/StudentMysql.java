package com.studentmedicalfacilitator.DAO;


import com.studentmedicalfacilitator.Models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository("Mysql")
public class StudentMysql implements StudentDao {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();

    @Override
    public int insertStudent(Student student) {
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        return 0;
    }

    @Override
    public List<Student> returnAllStudents() {
        return null;
    }

    @Override
    public Optional<Student> selectStudentById(int id) {
        return Optional.empty();
    }

    @Override
    public int deleteStudentById(int id) {
        return 0;
    }

    @Override
    public int updateStudentById(int id, Student student) {
        return 0;
    }
}
