import java.util.Scanner;

public class prog16 {
    public void access() {
        System.out.println("Access ");
    }
    public void view() {
        System.out.println("view");
    }

    public static void main(String[] args) {
        Admin a = new Admin();
        a.access();
        User u = new User();
        u.access();
    }
}

class Admin extends prog16 {
    public void access() {
        System.out.println("I can access");
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print("your name is: "+word+"\n");

        sc.close();
    }
    public void view() {
        System.out.println("I can view and access");
    }
}

class User extends prog16{
    public void access() {
        System.out.println("I cannot access");
    }
    public void view() {
        System.out.println("I can only view");
    }
}