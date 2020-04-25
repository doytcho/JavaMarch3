import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double totalGrade = 0;
        int i = 1;
        int badGrade = 0;
        while (i <= 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                totalGrade = totalGrade + grade;
                i++;
            } else {
                badGrade++;
                if (badGrade > 1) {
                    break;
                }
            }
        }
        if (i > 12) {
            double avgGrade = totalGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, i);
        }
    }
}
