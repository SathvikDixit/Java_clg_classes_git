public class prog20 {
    int id, salary;
    String name;

    public void getData() {
        if (salary > 20000) {
            System.out.println(id+" "+name+" "+salary);
        }
    }
    private void setData(int  id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[] args) {
        
        prog20 p = new prog20();
        p.setData(132, "Sathvik", 90000);
        p.getData();

        prog20 p2 = new prog20();
        p2.setData(1234, "hello", 2345);
        p2.getData();

        prog20 p3 = new prog20();
        p3.setData(1234, "hello", 234205);
        p3.getData();
        
    }
}
