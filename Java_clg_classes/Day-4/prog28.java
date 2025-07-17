import java.util.Scanner;

public class prog28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String s1 = sc.nextLine();
        System.out.print("Enter last name: ");
        String s2 = sc.nextLine();
        String s3 = s1 + " "+s2;
        System.out.print("Full name: "+s3);
        sc.close();
    }
}
