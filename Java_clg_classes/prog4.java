// Designing ATM 

import java.util.*;
public class prog4 {
    public static void main(String[] args) {
        int b = 1000;
        System.out.println("Insert you card");
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        int knownPin = 1234;
        if (pin == knownPin) {
            System.out.println("1. View Balance");
            System.out.println("2. Withdrawal");

           
            int choiceInput = sc.nextInt();

            if (choiceInput == 1) {
                System.out.println("Available Balance: "+b);
            } else {
                System.out.print("Select the account type:\n press 1. for savings acc  2. for current acc: ");
               
                int accTypedt = sc.nextInt();
                if(accTypedt == 1) {}

                System.out.print("Enter the amount: ");
               
                int w = sc.nextInt();
                
                if (w>0  && w<=b && w%100 == 0) {
                    int notes500 = w / 500;
                    w %= 500;
                    int notes100 = w / 100;
                    for(int i = 0; i < notes500; i++) {
                        System.out.print("500 ");
                    }
                    for(int i = 0; i<notes100; i++) {
                        System.out.print("100 ");
                    }
                } else {
                    System.out.println("enter valid amount");
                }
            }
        }

        else {
            System.out.println("Enter correct pin");
        }
        sc.close();
    }
}
