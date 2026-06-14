package com.vericred.university.controller;

import com.vericred.university.model.Course;
import com.vericred.university.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin("*")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

}