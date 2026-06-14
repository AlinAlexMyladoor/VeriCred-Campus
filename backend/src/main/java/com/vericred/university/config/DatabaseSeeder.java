package com.vericred.university.config;

import com.vericred.university.model.EnrollmentStatus;
import com.vericred.university.model.Student;
import com.vericred.university.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.vericred.university.model.Program;
import com.vericred.university.repository.ProgramRepository;

import java.util.List;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner initDatabase(
        StudentRepository studentRepository,
        ProgramRepository programRepository) {

        return args -> {

            if(studentRepository.count()==0){
                studentRepository.saveAll(List.of(

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

                System.out.println("Mock Student Database Initialized.");

            }
            if (programRepository.count() == 0) {

    programRepository.saveAll(List.of(

            new Program(
                    "PRG-001",
                    "B.Tech Computer Science",
                    "Computer Science",
                    4
            ),

            new Program(
                    "PRG-002",
                    "B.Tech Mechanical Engineering",
                    "Mechanical Engineering",
                    4
            ),

            new Program(
                    "PRG-003",
                    "Bachelor of Business Administration",
                    "Business Administration",
                    3
            )

    ));

    System.out.println("Program Database Initialized.");

}

        };

    }

}