package com.vericred.university.controller;

import com.vericred.university.model.Program;
import com.vericred.university.service.ProgramService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
@CrossOrigin("*")
public class ProgramController {

    private final ProgramService service;

    public ProgramController(ProgramService service) {
        this.service = service;
    }

    @GetMapping
    public List<Program> getPrograms() {
        return service.getAllPrograms();
    }

}