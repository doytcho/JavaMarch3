import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int badGrades = Integer.parseInt(scan.nextLine());
        int badGradesCnt = 0;
        double avrScore = 0;
        int counter = 0;
        String lastPoblem = "";
        String problem = scan.nextLine();
        while (!"Enough".equals(problem)) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade <= 4) {
                badGradesCnt++;
                if (badGradesCnt == badGrades) {
                    break;
                }
            }
                avrScore = avrScore + grade;
                counter++;
                lastPoblem = problem;
            problem = scan.nextLine();
        }
        if (badGrades == badGradesCnt) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", avrScore / counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", lastPoblem);
        }
    }
}
