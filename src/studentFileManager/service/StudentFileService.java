package studentFileManager.service;

import java.io.*;

public class StudentFileService {
    private final String FILE_NAME = "student.dat";

    public StudentFileService(){
        File file = new File(FILE_NAME);
        if (!file.exists()) {

            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                objectOutputStream.writeObject(new Student[0]);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void addStudent(Student student) {
        Student[] students = getAllStudents();


        Student[] newStudents = new Student[students.length + 1];

        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Duplicate id is not allowed");
                return;
            }
        }

        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }

        newStudents[students.length] = student;

        saveStudents(newStudents);

        System.out.println("lesson28.Student added");
    }

    private void saveStudents(Student[] newStudents) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(newStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student[] getAllStudents() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Student[]) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new Student[0];
        }
    }

    public void updateStudent(int id, Student updatedStudent) {
        Student[] students = getAllStudents();
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(updatedStudent.getName());
                s.setAge(updatedStudent.getAge());

                saveStudents(students);
                System.out.println("Students updated");
                return;
            }
        }
    }
    public void deletedStudent(int id){
        Student[] students = getAllStudents();

        int count = 0;

        for (Student s: students) {
            if (s.getId() != id){
                count++;
            }
        }

        Student[] newStudents = new Student[count];

        int i = 0;

        for (Student s : students) {
            if (s.getId() != id) {
                newStudents[i++] = s;
            }
        }

        saveStudents(newStudents);
    }

    public Student findById ( int id){
        Student[] students = getAllStudents();
        for (Student s: students){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }
    public Student[] findByName(String name){
        Student[] students = getAllStudents();
        int count = 0;

        for (Student s: students){
            if (s.getName().equals(name)){
                count++;
            }
        }
        Student[] result = new Student[count];

        int index = 0;

        for (Student s : students) {
            if (s.getName().equals(name)) {
                result[index++] = s;
            }
        }
        return result;
    }
}
