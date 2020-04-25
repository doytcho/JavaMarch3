import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;
        double totalSumAssessment = 0;
        String presentation = scan.nextLine();
        while (!"Finish".equals(presentation)) {
            double sumAssessment = 0;
            for (int i = 0; i < n; i++) {
                double assussment = Double.parseDouble(scan.nextLine());
                sumAssessment = sumAssessment + assussment;
                totalSumAssessment = totalSumAssessment + assussment;
            }
            System.out.printf("%s - %.2f.%n", presentation, sumAssessment / n);
            counter++;
            presentation = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalSumAssessment / n / counter);
    }
}
