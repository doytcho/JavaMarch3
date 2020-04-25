import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seekedBook = scan.nextLine();
        int labaryCapacity = Integer.parseInt(scan.nextLine());
        int count = 0;
        while (count < labaryCapacity) {
            String book = scan.nextLine();
            if (book.equals(seekedBook)) {
                break;
            } else {
                count++;
            }
        }
        if (count < labaryCapacity) {
            System.out.printf("You checked %d books and found it.",count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",count);
        }
    }
}
