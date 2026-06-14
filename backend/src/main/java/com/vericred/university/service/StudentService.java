package com.vericred.university.service;

import com.vericred.university.model.Student;
import com.vericred.university.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.vericred.university.dto.StudentDTO;
import com.vericred.university.exception.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }
    public StudentDTO getStudentDTOById(String id) {

    Student student = repository.findById(id)
            .orElseThrow(() ->
                    new ResourceNotFoundException("Student not found with ID: " + id));

    return new StudentDTO(
            student.getStudentId(),
            student.getFullName(),
            student.getEmail(),
            student.getDepartment(),
            student.getProgram(),
            student.getSemester(),
            student.getEnrollmentStatus().name()
    );

}

    public Optional<Student> getStudentById(String id) {
        return repository.findById(id);
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(String id, Student student) {

        student.setStudentId(id);

        return repository.save(student);

    }

    public void deleteStudent(String id) {

        repository.deleteById(id);

    }

}