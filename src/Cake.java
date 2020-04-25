import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int cakeArea = lenght * width;
        while (cakeArea >= 0) {
            String input = scan.nextLine();
            if ("STOP".equals(input)) {
                break;
            } else {
                cakeArea = cakeArea - Integer.parseInt(input);
            }
        }
        if (cakeArea >= 0) {
            System.out.printf("%d pieces are left.", cakeArea);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
        }
    }
}
