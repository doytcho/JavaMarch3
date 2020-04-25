import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 'a'; k < 'a' + l; k++) {
                    for (char m = 'a'; m < 'a' + l; m++) {
                        int biggerNumber = 0;
                        if (i >= j) {
                            biggerNumber = i;
                        } else {
                            biggerNumber = j;
                        }
                        if (biggerNumber + 1 > n) {
                            break;
                        }
                        for (int o = biggerNumber + 1; o <= n; o++) {
                            System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                        }
                    }
                }
            }
        }
    }
}