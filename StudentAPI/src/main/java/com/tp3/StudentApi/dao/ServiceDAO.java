package com.tp3.StudentApi.dao;
import com.example.StudentAPI.model.Student;



import java.util.List;

public interface ServiceDAO {

    public Student findById(int id);

    public List<Student> getAll();

    public Student update(int id, Student student);

    public boolean create(Student student);

    public boolean delete(int id);
}
