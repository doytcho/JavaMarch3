import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sumPrimeNumber = 0;
        int sumNonPrimeNumber = 0;
        while (!"stop".equals(input)) {
            int number = Integer.parseInt(input);
            input = scan.nextLine();
            boolean flag = false;
            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = true;
                    }
                }
                if (flag) {
                    sumNonPrimeNumber = sumNonPrimeNumber + number;
                } else {
                    sumPrimeNumber = sumPrimeNumber + number;
                }
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumber);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumber);
    }
}
