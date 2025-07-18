import java.util.ArrayList;
import java.util.Scanner;

public class prog35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> s = new ArrayList<>();
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            s.add(a);        
        }
        for(int b : s) {
            if(b < 0) {
                int pos = s.indexOf(b);
                s.remove(pos);
            }
        }
        System.out.println(s);

        // int max = s[0];
        // for (int b : s) {
        //     if (max < b) {
        //         s.set(b, null);
        //     }
        // }

        sc.close();
    }

}
