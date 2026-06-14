package com.vericred.university.config;

import com.vericred.university.model.EnrollmentStatus;
import com.vericred.university.model.Student;
import com.vericred.university.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.saveAll(List.of(

    new Student(
            "STU-1001",
            "Alice Johnson",
            "alice@vericred.edu",
            "Computer Science",
            "B.Tech CSE",
            6,
            EnrollmentStatus.ACTIVE
    ),

    new Student(
            "STU-1002",
            "Bob Smith",
            "bob@vericred.edu",
            "Mechanical Engineering",
            "B.Tech ME",
            4,
            EnrollmentStatus.ACTIVE
    ),

    new Student(
            "STU-1003",
            "Charlie Davis",
            "charlie@vericred.edu",
            "Business Administration",
            "BBA",
            8,
            EnrollmentStatus.GRADUATED
    )

));
                System.out.println("Mock student database initialized with 3 records.");
            }
        };
    }
}