import java.util.*;
public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >17 && age < 100) {
            System.out.println("You can vote");
        } else if (age < 18) {
            System.out.println("Not eligible brooo");
        } else {
            System.out.println("enter a valid age");
        }
        scanner.close();
    }
}
