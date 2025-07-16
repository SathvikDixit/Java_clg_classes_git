public class prog6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 5; i <= 15; i++) {
            System.out.print(" "+i);
        }

        for (int i = 6; i <= 14; i++) {   // The way to do this shit is by incrementing it my 2 numbers  "i+=2" 
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
