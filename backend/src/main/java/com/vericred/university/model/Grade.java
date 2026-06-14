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
public class Grade {

    @Id
    private String gradeId;

    private String enrollmentId;

    private String grade;

    private Double marks;

}