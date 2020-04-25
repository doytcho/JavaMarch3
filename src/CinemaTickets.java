import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int students = 0;
        int standard = 0;
        int kids = 0;
        while (!"Finish".equals(movie)) {
            int seats = Integer.parseInt(scan.nextLine());
            String tiketType = scan.nextLine();
            int counter = 0;
            while (!"End".equals(tiketType)) {
                switch (tiketType) {
                    case "student":
                        students++;
                        counter++;
                        break;
                    case "standard":
                        standard++;
                        counter++;
                        break;
                    case "kid":
                        kids++;
                        counter++;
                        break;
                }
                if (counter == seats) {
                    break;
                }
                tiketType = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, 100.0 * counter / seats);
            movie = scan.nextLine();
        }
        int totalTikets = students + standard + kids;
        System.out.printf("Total tickets: %d%n", totalTikets);
        System.out.printf("%.2f%% student tickets.%n", 100.0 * students / totalTikets);
        System.out.printf("%.2f%% standard tickets.%n", 100.0 * standard / totalTikets);
        System.out.printf("%.2f%% kids tickets.%n", 100.0 * kids / totalTikets);
    }
}
