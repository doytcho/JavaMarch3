import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resto = Double.parseDouble(scan.nextLine());
        double restoInstotinki = Math.round(resto * 100);
        int coins = 0;
        while ((restoInstotinki > 0)) {
            if (restoInstotinki - 200 >= 0) {
                restoInstotinki = restoInstotinki - 200;
                coins++;
            } else if (restoInstotinki - 100 >= 0) {
                restoInstotinki = restoInstotinki - 100;
                coins++;
            } else if (restoInstotinki - 50 >= 0) {
                restoInstotinki = restoInstotinki - 50;
                coins++;
            } else if (restoInstotinki - 20 >= 0) {
                restoInstotinki = restoInstotinki - 20;
                coins++;
            } else if (restoInstotinki - 10 >= 0) {
                restoInstotinki = restoInstotinki - 10;
                coins++;
            } else if (restoInstotinki - 5 >= 0) {
                restoInstotinki = restoInstotinki - 5;
                coins++;
            } else if (restoInstotinki - 2 >= 0) {
                restoInstotinki = restoInstotinki - 2;
                coins++;
            } else if (restoInstotinki - 1 >= 0) {
                restoInstotinki = restoInstotinki - 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
