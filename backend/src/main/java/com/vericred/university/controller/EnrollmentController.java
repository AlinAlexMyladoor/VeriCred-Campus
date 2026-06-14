package com.vericred.university.controller;

import com.vericred.university.model.Enrollment;
import com.vericred.university.service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin("*")
public class EnrollmentController {

    private final EnrollmentService service;

    public EnrollmentController(EnrollmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Enrollment> getEnrollments() {
        return service.getAllEnrollments();
    }

}