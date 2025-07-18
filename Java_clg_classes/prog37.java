
// WAP to take names of 5 students and their rool numbers in an array list and hash set respectively then create list of 5 names and another rool number for another class and verify if there is overlap in rool numbers 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class prog37 {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        ArrayList<String> n = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter 1st section roll number: ");
            a.add(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter 1st section names: ");
            n.add(sc.nextLine());
        }
        // System.out.print("Enter names: ");
        // for(int j = 0; j < 5; j++) {
        //     n.add(sc.nextLine());
        // }

        HashSet<Integer> bB = new HashSet<>();
        ArrayList<String> nB = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter 2st section roll number: ");
            bB.add(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter 2st section name: ");
            nB.add(sc.nextLine());
        }
        // System.out.print("Enter names: ");
        // for(int j = 0; j < 5; j++) {
        //     nB.add(sc.nextLine());
        // }

        if(a.retainAll(bB)) {
            System.out.println(a);
        }

        sc.close();
    }
}
