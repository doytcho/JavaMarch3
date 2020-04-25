import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String input = scan.nextLine();
        while (!"Stop".equals(input)) {
            int number = Integer.parseInt(input);
            sum = sum + number;
            input = scan.next();
        }
        System.out.println(sum);
    }
}
