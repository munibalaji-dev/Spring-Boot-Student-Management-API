package com.munibalaji.StudentManagement.repositories;

import com.munibalaji.StudentManagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
