import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of copies soled: ");
        int w = scanner.nextInt();

        System.out.print("Cost of each newspaper: ");
        int x = scanner.nextInt();

        System.out.print("Cost of each newspaper for agency: ");
        int y = scanner.nextInt();

        int profit = w*(x-y)-100;
        System.out.print("Total profit is Rs. "+profit);
        scanner.close();
    }
}

