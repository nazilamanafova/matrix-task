package lesson28;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare( Student student1, Student student2) {
        return Double.compare(student1.getAverageScore(), student2.getAverageScore());
    }
}
