import java.util.Scanner;

public class prog30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Enter 3 string: ");
        for(int i = 0; i < 3; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("reversed names");
        for(int i = 2; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
