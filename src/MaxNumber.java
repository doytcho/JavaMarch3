import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int i = 1;
        while (i <= n) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > maxNumber) {
                maxNumber = number;
            }
            i++;
        }
        System.out.println(maxNumber);
    }
}
