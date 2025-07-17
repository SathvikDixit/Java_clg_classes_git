import java.util.Scanner;

public class prog31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String name = sc.nextLine();
        String rev = "";
        for(int i = name.length()-1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.print(rev);
        sc.close();

        if (name.equals(rev)) {
            System.out.println("\nThis is palandrome");
        } else {
            System.out.println("It's not palandrome");
        }
    }
}
