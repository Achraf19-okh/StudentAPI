package com.tp3.StudentApi.controller;
import com.example.StudentAPI.model.Student;
import com.tp3.StudentApi.dao.ServiceDAO;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private ServiceDAO studentDAO;


    @GetMapping("/Students")
    public List<Student> getStudents() {
        return studentDAO.getAll();
    }

    @GetMapping("/Students/{id}")
    public Student getStudentsDetails(@PathVariable int id) {
        return studentDAO.findById(id);
    }

    @PutMapping("/students/{id}")
    public Student putStudents(@PathVariable int id, @RequestBody Student p) {
        return studentDAO.update(id, p);
    }

    @PostMapping("/students")
    public boolean postStudents(@RequestBody Student p) {
        return studentDAO.create(p);
    }
    @DeleteMapping("/students/{id}")
    public boolean deleteStudents(@PathVariable int id) {
        return studentDAO.delete(id);
    }

}
