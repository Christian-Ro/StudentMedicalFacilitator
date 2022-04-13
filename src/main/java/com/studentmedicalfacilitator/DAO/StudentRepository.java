package com.studentmedicalfacilitator.DAO;

import com.studentmedicalfacilitator.Entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long> {

}
