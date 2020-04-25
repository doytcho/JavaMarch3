import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double totalGrade = 0;
        int i = 0;
        while (i < 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                totalGrade = totalGrade + grade;
                i++;
            }
        }
        double avgGrade = totalGrade / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
    }
}
