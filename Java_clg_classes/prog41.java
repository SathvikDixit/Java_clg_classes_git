import java.util.*;
public class prog41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>();

        System.out.print("Enter the name and marks of 5 students: ");
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            int marks = sc.nextInt();

            h.put(name, marks);
            sc.nextLine();
        }
        System.out.println(h);

        for(Integer s: h.values()) {
            if(s >= 40) {
                System.out.println("Passed students are: "+s);
            }
        }
        sc.close();
    }
}
