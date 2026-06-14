package com.vericred.university.controller;

import com.vericred.university.model.Grade;
import com.vericred.university.service.GradeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
@CrossOrigin("*")
public class GradeController {

    private final GradeService service;

    public GradeController(GradeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Grade> getGrades() {
        return service.getAllGrades();
    }

}