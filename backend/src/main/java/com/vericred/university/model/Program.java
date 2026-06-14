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
public class Program {

    @Id
    private String programId;

    private String programName;

    private String department;

    private Integer durationYears;

}