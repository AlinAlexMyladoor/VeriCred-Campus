package com.vericred.university.service;

import com.vericred.university.model.Enrollment;
import com.vericred.university.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    private final EnrollmentRepository repository;

    public EnrollmentService(EnrollmentRepository repository) {
        this.repository = repository;
    }

    public List<Enrollment> getAllEnrollments() {
        return repository.findAll();
    }

}