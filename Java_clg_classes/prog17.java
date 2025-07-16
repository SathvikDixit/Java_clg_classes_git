import java.util.Scanner;

class saving{
    public void getIntrest(double amt) {
        System.out.println(amt*4/100);
    }
}


class fixedDepposit{
    public void getIntrest(double amt) {
        System.out.println(amt*6/100);
    }
}

class recurringDeposite{
    public void getIntrest(double amt) {
        System.out.println(amt*8/100);
    }
}

public class prog17 {
    public static void main(String[] args) {
        System.out.print("1 for savings and 2 for fixedDeposite and 3 for recurringDepposite: ");
        saving s = new saving();
        fixedDepposit f = new fixedDepposit();
        recurringDeposite r = new recurringDeposite();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.print("Enter amount: ");
            Double amt = sc.nextDouble();
            s.getIntrest(amt);
        }
        else if (n == 2){
            System.out.print("Enter amount: ");
            Double amtD = sc.nextDouble();
            f.getIntrest(amtD);
        }
        else {
            System.out.print("Enter amount: ");
            Double amtR = sc.nextDouble();
            r.getIntrest(amtR);
        }
        sc.close();
    }
}