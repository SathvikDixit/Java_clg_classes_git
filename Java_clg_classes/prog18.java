import java.util.Scanner;

public class prog18 {
    private String name ;
    private String usn ;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void getData() {
        System.out.println(name+ " "+usn+" "+age);
    }
    public static void main(String[] args) {
        
        prog18 s = new prog18();
        Scanner sc = new Scanner(System.in);
        int aggee = sc.nextInt();
        sc.close();
        s.setAge(aggee);
        s.getData();
    }
}
