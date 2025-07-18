                                // Exception handling

import java.util.Scanner;

public class prog32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to divide with: ");
        int a = sc.nextInt();
        System.out.print("Enter the number to which you want to divide: ");
        int b = sc.nextInt();
        int ans = 0;

        try {
            ans = b/a;
        } catch(Exception e) {
            System.out.println("Do not divide numbers with zero it's injuries to health.");
        }

        System.out.println(ans);
        sc.close();
    }
}
