package com.example.StudentAPI.model;

public class Student {
    private int id;
    private String name;
    private String major;
    private int age;

    public Student(int id, String name, String major, int age ){
        this.id = id;
        this.name = name;
        this.major = major;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String nom) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
