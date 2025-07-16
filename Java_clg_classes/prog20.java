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
        
    }
}
