import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        String password = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals(password)) {
            input = scan.next();
        }
        System.out.printf("Welcome %s!", userName);
    }
}
