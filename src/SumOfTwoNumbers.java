import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int combination = 0;
        int counter = 0;
        for (int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                counter++;
                if (i + j == magicNumber && combination == 0) {
                    combination = counter;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNumber);
                }
            }
        }
        if (combination == 0) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
