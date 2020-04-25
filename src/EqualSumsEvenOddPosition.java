import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        for (int i = num1; i <= num2; i++) {
            String number = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < number.length(); j++) {
                if (j % 2 == 0) {
                    evenSum = evenSum + Integer.parseInt("" + number.charAt(j));
                } else {
                    oddSum = oddSum + Integer.parseInt("" + number.charAt(j));
                }
            }
            if (evenSum == oddSum) {
                System.out.printf("%s ", number);
            }
        }
    }
}
