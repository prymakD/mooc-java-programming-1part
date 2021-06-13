
import java.util.ArrayList;

public class Grading {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;

    public Grading() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void add(int value) {
        if (value >= 0 && value <= 100) {
            points.add(value);
        }
    }

    public double average() {
        int average = 0;
        for (int point : points) {
            average += point;
        }

        average /= points.size() * 1.0;
        return average;
    }

    public double averagePassing() {
        int average = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                average += point;
                count++;
            }
        }

        if (average == 0) {
            return 0.0;
        }

        average /= count * 1.0;
        return average;
    }

    public double passPercentage() {
        int countPassing = 0;
        for (int point : points) {
            if (point >= 50) {
                countPassing++;
            }
        }
        
        return 100.0 * countPassing / points.size();
    }
}
