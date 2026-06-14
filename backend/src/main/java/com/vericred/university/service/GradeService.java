package com.vericred.university.service;

import com.vericred.university.model.Grade;
import com.vericred.university.repository.GradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    private final GradeRepository repository;

    public GradeService(GradeRepository repository) {
        this.repository = repository;
    }

    public List<Grade> getAllGrades() {
        return repository.findAll();
    }

}