package lesson28;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double averageScore;
    private String course;

    public Student(String name, int age, double averageScore, String course) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "lesson28.Student{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
