import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalMoney = 0.0;
        int incomes = Integer.parseInt(scan.nextLine());
        int counter = 0;
        while (counter < incomes) {
            double money = Double.parseDouble(scan.nextLine());
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            totalMoney = totalMoney + money;
            System.out.printf("Increase: %.2f%n", money);
            counter++;
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
