import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int i = 1;
        while (i <= n) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < minNumber) {
                minNumber = number;
            }
            i++;
        }
        System.out.println(minNumber);
    }
}
