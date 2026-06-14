package com.vericred.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String studentId;

    private String fullName;

    private String email;

    private String department;

    private String program;

    private Integer semester;

    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentStatus;

}