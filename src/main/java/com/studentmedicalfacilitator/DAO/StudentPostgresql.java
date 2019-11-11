package com.studentmedicalfacilitator.DAO;

import com.studentmedicalfacilitator.Models.Student;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

@Repository("postgres")
public class StudentPostgresql implements StudentDao {

    Connection conn = null;
    Statement statement = null;
    ResultSet rs = null;

    try {
        Properties properties = new Properties();
        properties.load(new FileInputStream("application.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String dbUrl = properties.getProperty("dburl");

        conn = DriverManager.getConnection(dbUrl);
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
