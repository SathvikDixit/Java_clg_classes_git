import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        System.out.print("Enter value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("Enter the operation you want to perform (eg: +, -, *, /, %): ");
        
        sc.close();

        System.out.println(add(a,b));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }

}
