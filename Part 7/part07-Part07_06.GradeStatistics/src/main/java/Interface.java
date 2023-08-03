import java.util.Scanner;

public class Interface {
    
    private Scanner scan;
    private Grading grades;

    public Interface(Scanner scan) {
        this.scan = scan;
        this.grades = new Grading();
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");
        while(true) {
            
            int point = Integer.valueOf(this.scan.nextLine());
            if (point == -1) {
                break;
            } else if (point >= 0 && point <= 100) {
                this.grades.addPoint(point);
            }
        }

        System.out.println("Point average (all): " + this.grades.getAverage());
        System.out.println("Point average (passing): " + ((this.grades.getAveragePassing() > 0) ? this.grades.getAveragePassing() : "-"));
        System.out.println("Pass percentage: " + this.grades.getPassPercentage());
        System.out.println("Grade distribution:");
        this.grades.printGrades();

    }
}
