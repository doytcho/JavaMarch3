import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        double currentMoney = Double.parseDouble(scan.nextLine());
        int spendCounter = 0;
        int days = 0;
        while (currentMoney < budjet) {
            days++;
            String comand = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            if ("save".equals(comand)) {
                currentMoney = currentMoney + money;
                spendCounter = 0;
            }
            if ("spend".equals(comand)) {
                spendCounter++;
                currentMoney = currentMoney - money;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
                if (spendCounter == 5) {
                    break;
                }
            }
        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
