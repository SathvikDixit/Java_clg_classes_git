
import java.util.Scanner;
public class prog8 {
    public static void main(String[] args) {
        int c =15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            if (i<=c) {
                System.out.println("candy");
            } else {
                System.out.println("Out of stock");
                break;
            }
        }
        sc.close();
    }
}
