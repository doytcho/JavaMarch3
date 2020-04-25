import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int totalVolume = weight * lenght * height;
        String input = scan.nextLine();
        while (totalVolume > 0) {
            if ("Done".equals(input)) {
                break;
            } else {
                totalVolume = totalVolume - Integer.parseInt(input);
            }
            if (totalVolume < 0) {
                break;
            }
            input = scan.next();
        }
        if (totalVolume < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalVolume));
        } else {
            System.out.printf("%d Cubic meters left.", totalVolume);
        }
    }
}
