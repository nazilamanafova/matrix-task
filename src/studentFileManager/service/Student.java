package studentFileManager.service;

import studentFileManager.exception.InvalidStudentException;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private  String name;
    private int age;

    public Student(int id, String name, int age) {

        if (id <= 0 ){
            throw new InvalidStudentException("Invalid student id");
        }
        if (name == null) {
            throw new InvalidStudentException("Invalid student name");
        }
        if (age <= 0) {
            throw new InvalidStudentException("Invalid student age");
        }
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return id + " " + name + " " + age;
    }
}
