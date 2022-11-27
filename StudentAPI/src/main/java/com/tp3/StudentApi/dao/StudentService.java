package com.tp3.StudentApi.dao;

import org.springframework.stereotype.Repository;
import com.example.StudentAPI.model.Student;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentService implements ServiceDAO {

    List<com.example.StudentAPI.model.Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
        this.students.add(new Student(1, "Achraf","Computer Science",20));
        this.students.add(new Student(2, "Okhaya","Physics",20));
        this.students.add(new Student(3, "Kevin", "Maths",21));
        this.students.add(new Student(4, "Lee","Logistics", 25));
        this.students.add(new Student(5, "Chris","Physics",20));
        this.students.add(new Student(6, "Reda", "Maths",21));
        this.students.add(new Student(7, "Salma","Logistics", 25));
    }

    public Student findById(int id) {
        for (Student p : this.students) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }

    public List<Student> getAll() {
        return this.students;
    }

    public Student update(int id, Student student) {
        for (Student p : this.students) {
            if (id == p.getId()) {
                p.setName(student.getName());
                p.setAge(student.getAge());
                p.setMajor(student.getMajor());
                return p;
            }
        }
        return null;
    }

    public boolean create(Student student) {
        for (Student p : this.students) {
            if (student.getId() == p.getId()) {
                return false;
            }
        }
        return this.students.add(student);
    }

    public boolean delete(int id) {
        for (Student p : this.students) {
            if (id == p.getId()) {
                return this.students.remove(p);
            }
        }
        return false;
    }
}
