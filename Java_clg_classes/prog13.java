import java.util.Scanner;

class prog13 {
    public void name(String eName) {
        System.out.println("Employee Name: "+eName);
    }
    public void salary(int sal) {
        System.out.print("Employee Salary: "+sal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String eName = sc.nextLine();
        
        System.out.print("Enter Salary: ");
        int sal = sc.nextInt();
        
        prog13 e = new prog13();
        e.name(eName);
        e.salary(sal);
        
        sc.close();
    }
}