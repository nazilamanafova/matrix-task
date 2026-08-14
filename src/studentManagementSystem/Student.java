package studentManagementSystem;

class Student {
    int id;
    String name;
    int age;

    static int studentCount = 0;
    static int totalAge = 0;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        totalAge += age;
        studentCount++;
    }

    void printInfo() {
        System.out.println("Id: " + id + "Name: " + name + "Age: " + age);
    }

    static void printStudentCount() {
        System.out.println("Total students: " + studentCount);
    }

    static void printAverageAge() {
        if (studentCount > 0) {
            double average = (double) totalAge / studentCount;

            System.out.println("Average age " + average);
        }
    }
    /* StudentManagementSystem.lesson28.Student s1 = new StudentManagementSystem.lesson28.Student(1, "Ali", 20);
    StudentManagementSystem.lesson28.Student s2 = new StudentManagementSystem.lesson28.Student(2, "Veli", 21);
    StudentManagementSystem.lesson28.Student s3 = new StudentManagementSystem.lesson28.Student(3, "Aysel", 19);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        System.out.println();
        StudentManagementSystem.lesson28.Student.printStudentCount();
        StudentManagementSystem.lesson28.Student.printAverageAge(); */
}