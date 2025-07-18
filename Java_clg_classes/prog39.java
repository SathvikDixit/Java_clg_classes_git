import java.util.HashSet;
import java.util.Scanner;

public class prog39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> f1 = new HashSet<>();
        System.out.print("Enter your any 3 hobbies: ");
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            f1.add(name);
        }

        HashSet<String> f2 = new HashSet<>();
        System.out.print("Enter your any 3 hobbies: ");
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            f2.add(name);
        }

        if(f1.retainAll(f2)) {
            System.out.println("You have simillar hobbies."+f1);
        }
        sc.close();
    }
}
