package calculator;
// package calculator;

public class demo {
    public static void main(String[] args) {
        AdvCalc a = new AdvCalc();
        int r1 = a.add(5, 5);
        int r2 = a.sub(10, 5);
        int r3 = a.mul(5, 5);
        int r4 = a.div(10, 5);


        System.out.println("Sum is: " + r1 + ", Sub  is: " + r2 + ", Multiple is: "+ r3 + ", Division is: "+ r4)  ;
    }
}

// class calc {
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }
//     public int sub(int n1, int n2) {
//         return n1 - n2;
//     }
// }
// class AdvCalc extends calc {
//     public int mul(int n1, int n2) {
//         return n1 * n2;
//     }
//     public int div(int n1, int n2) {
//         return n1 / n2;
//     }
// }

/* To run classes in different files in the same folder the prompt goes by: 
            javac FOLDER_NAME/FILE_NAME.java  and  java FOLDER_NAME.FILE_NAME */ 


/* And if to a java file with multiple classes the prompt goes by:
            javac FILE_NAME.java  and  java FILE_NAME   */