package com.vericred.university.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vericred.university.model.Course;
import com.vericred.university.model.Enrollment;
import com.vericred.university.model.EnrollmentStatus;
import com.vericred.university.model.Program;
import com.vericred.university.model.Student;
import com.vericred.university.repository.CourseRepository;
import com.vericred.university.repository.EnrollmentRepository;
import com.vericred.university.repository.ProgramRepository;
import com.vericred.university.repository.StudentRepository;

@Configuration
public class DatabaseSeeder {

    @Bean
   CommandLineRunner initDatabase(
        StudentRepository studentRepository,
        ProgramRepository programRepository,
        CourseRepository courseRepository,
        EnrollmentRepository enrollmentRepository) {

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
if (courseRepository.count() == 0) {

    courseRepository.saveAll(List.of(

            new Course(
                    "CSE101",
                    "Programming Fundamentals",
                    "PRG-001",
                    1,
                    4
            ),

            new Course(
                    "CSE201",
                    "Data Structures",
                    "PRG-001",
                    2,
                    4
            ),

            new Course(
                    "CSE301",
                    "Database Systems",
                    "PRG-001",
                    3,
                    4
            ),

            new Course(
                    "MEC101",
                    "Engineering Mechanics",
                    "PRG-002",
                    1,
                    4
            ),

            new Course(
                    "MEC201",
                    "Thermodynamics",
                    "PRG-002",
                    2,
                    4
            ),

            new Course(
                    "BBA101",
                    "Business Management",
                    "PRG-003",
                    1,
                    3
            )

    ));

    System.out.println("Course Database Initialized.");

}
if (enrollmentRepository.count() == 0) {

    enrollmentRepository.saveAll(List.of(

            new Enrollment(
                    "ENR-001",
                    "STU-1001",
                    "CSE101",
                    "2025-2026",
                    1
            ),

            new Enrollment(
                    "ENR-002",
                    "STU-1001",
                    "CSE201",
                    "2025-2026",
                    2
            ),

            new Enrollment(
                    "ENR-003",
                    "STU-1002",
                    "MEC101",
                    "2025-2026",
                    1
            ),

            new Enrollment(
                    "ENR-004",
                    "STU-1002",
                    "MEC201",
                    "2025-2026",
                    2
            ),

            new Enrollment(
                    "ENR-005",
                    "STU-1003",
                    "BBA101",
                    "2025-2026",
                    1
            )

    ));

    System.out.println("Enrollment Database Initialized.");

}

        };

    }

}