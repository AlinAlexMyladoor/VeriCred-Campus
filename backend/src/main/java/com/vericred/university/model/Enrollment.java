package com.vericred.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {

    @Id
    private String enrollmentId;

    private String studentId;

    private String courseId;

    private String academicYear;

    private Integer semester;

}