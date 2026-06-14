
package com.vericred.university.service;

import com.vericred.university.model.Program;
import com.vericred.university.repository.ProgramRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    private final ProgramRepository repository;

    public ProgramService(ProgramRepository repository) {
        this.repository = repository;
    }

    public List<Program> getAllPrograms() {
        return repository.findAll();
    }

}