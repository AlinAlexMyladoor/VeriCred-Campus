package com.vericred.university.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private String studentId;

    private String fullName;

    private String email;

    private String department;

    private String program;

    private Integer semester;

    private String enrollmentStatus;

}