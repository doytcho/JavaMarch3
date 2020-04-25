import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = 0;
        while (steps < 10000) {
            String input = scan.nextLine();
            if ("Going home".equals(input)) {
                steps = steps + Integer.parseInt(scan.nextLine());
                break;
            } else {
                steps = steps + Integer.parseInt(input);
            }
        }
        if (steps >= 10000) {
            System.out.printf("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        }
    }
}
