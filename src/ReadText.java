import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!"Stop".equals(input)) {
            input = scan.next();
        }
    }
}
