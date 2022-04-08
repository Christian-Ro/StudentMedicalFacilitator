package com.studentmedicalfacilitator.DAO;

import com.studentmedicalfacilitator.Models.Student;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Repository("postgresProcess")
public class StudentPostgresql implements StudentDao {

    Connection conn = null;
    Statement statement = null;
    ResultSet rs = null;
    Properties properties = new Properties();

    String user = properties.getProperty("user");
    String password = properties.getProperty("password");
    String dbUrl = properties.getProperty("dburl");
    String conUrl = "dbc:postgresql://localhost:5432/StudentMedicalFacilitator";



    @Override
    public int insertStudent(Student student) {

        try{
            //properties.load(new FileInputStream("application.properties"));
            conn = DriverManager.getConnection(conUrl);
            statement = conn.createStatement();
            statement.executeQuery("INSERT John INTO test");
            System.out.println("Statement Executed");
        }
        catch (Exception e){
            e.printStackTrace();
        }


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
