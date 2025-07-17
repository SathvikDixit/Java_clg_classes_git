import java.util.Scanner;

public class prog24 {
    public static void main(String[] args) {
        int arr[] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; 
        for(int i = 0; i < 5; i++) {
            if(max<arr[i])
            max = arr[i];
        }
        System.out.println("The maximum element is: "+max);

        int min = arr[0]; 
        for(int i = 0; i < 5; i++) {
            if(min > arr[i])
            min = arr[i];
        }
        System.out.println("the minimum element is: "+min);

        for(int i = 0; i < 5; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
