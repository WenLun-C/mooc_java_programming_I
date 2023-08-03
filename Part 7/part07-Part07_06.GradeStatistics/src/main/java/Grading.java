import java.util.ArrayList;

public class Grading {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grading() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public int pointsToGrade(int pt) {
        if (pt < 50) return 0;
        else if (pt < 60) return 1;
        else if (pt < 70) return 2;
        else if (pt < 80) return 3;
        else if (pt < 90) return 4;
        else return 5;
    }

    public void addPoint(int pt) {
        this.points.add(pt);
        this.grades.add(pointsToGrade(pt));
    }

    public double getAverage() {
        int total = 0;
        for (int i : this.points) {
            total+=i;

        }
        return total*1.0/this.points.size();
    }

    public double getAveragePassing() {
        int total = 0;
        int count = 0;
        for (int i : this.points) {
            if (i >= 50) {
                total+=i;
                count++;
            }
        }

        if (count > 0) {
            return (total*1.0) / count;
        } else {
            return 0;
        }

    }

    public double getPassPercentage() {
        int count = 0;
        for (int i : this.points) {
            if (i >= 50) {
                count++;
            }
        }

        if (count > 0) {
            return (count*100.0) / this.points.size();
        } else {
            return 0.0;
        }
    }

    public String getStars(int grade) {
        String str = "";
        for (int i : this.grades) {
            if (i == grade) {
                str+="*";
            }
        }
        return str;
    }

    public void printGrades() {
        int i = 5;
        while (i >= 0) {
            System.out.println(i + ": " + getStars(i));
            i--;
        }
    }
    
}
