import java.util.Scanner;
public class prog1 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        // int r = 5;
        System.out.print("Enter the radius of the circle : ");
        int r = scanner.nextInt();
        System.out.print("Area of the circle is ");
        System.out.print(pi*r*r);
        scanner.close();
    }
}