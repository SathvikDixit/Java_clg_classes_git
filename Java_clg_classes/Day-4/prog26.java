import java.util.Scanner;

public class prog26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.print("Enter the characters: ");
        
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        for(String i: arr) {
            if (i.equals("a") || i.equals("e")  || i.equals("i")  || i.equals( "o") || i.equals("u") ) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
