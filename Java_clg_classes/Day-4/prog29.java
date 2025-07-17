import java.util.Scanner;

public class prog29 {
    public static void main(String[] args) {

        String[] names = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 5 name: ");
        for(int i = 0; i < 5; i++ ){
            names[i] = sc.nextLine();
        }
        for(String st: names) {
            if (st.charAt(0) == 'a') {
                System.out.println(st);
            }
        }
        sc.close();
    }
    
}
