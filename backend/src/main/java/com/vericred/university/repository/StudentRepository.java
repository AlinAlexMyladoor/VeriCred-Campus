package com.vericred.university.repository;

import com.vericred.university.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // JpaRepository gives us findById() for free!
}