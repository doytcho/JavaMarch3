import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!"End".equals(input)) {
            double budjet = Double.parseDouble(scan.nextLine());
            double money = 0;
            while (money < budjet) {
                double currentMoney = Double.parseDouble(scan.nextLine());
                money = money + currentMoney;
            }
            System.out.printf("Going to %s!%n", input);
            input = scan.nextLine();
        }
    }
}
