package com.vericred.university.controller;

import com.vericred.university.model.Student;
import com.vericred.university.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vericred.university.dto.StudentDTO;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {

        this.service = service;

    }

    @GetMapping
    public List<Student> getAllStudents() {

        return service.getAllStudents();

    }

    @GetMapping("/{id}")
public ResponseEntity<StudentDTO> getStudent(@PathVariable String id) {

    return ResponseEntity.ok(service.getStudentDTOById(id));

}

    @PostMapping
    public Student addStudent(@RequestBody Student student) {

        return service.saveStudent(student);

    }

    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable String id,
            @RequestBody Student student) {

        return service.updateStudent(id, student);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {

        service.deleteStudent(id);

        return ResponseEntity.noContent().build();

    }

}