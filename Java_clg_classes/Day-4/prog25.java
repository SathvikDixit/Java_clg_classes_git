import java.util.Scanner;

public class prog25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[5];
        int[] cold = new int[5];
        int[] normal = new int[5];
        System.out.print("Enter the items: ");
        for (int i =0; i < 5; i++) {
            temp[i] = sc.nextInt();
        } 
        int c = 0;
        int n = 0;
        for(int i=0; i < 5; i++) {
            if (temp[i] > 10) {
                normal[n] = temp[i];
                n++;
            } else {
                cold[c] = temp[i];
                c++;
            }
        }
        System.out.print("COld storage is: ");
        for(int i =0; i<5; i++) {
            if (cold[i] != 0) {
                System.out.print(cold[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Normal storage is: ");
        for(int i =0; i<5; i++) {
            if (normal[i] != 0) {
                System.out.print(normal[i] + " ");

            }
        }
        sc.close();
    }
}
