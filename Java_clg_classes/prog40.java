import java.util.HashMap;

public class prog40 {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1, "Pranav");
        m.put(2, "Sathvik");
        m.put(3, "Surya");
        System.out.println(m);
        m.remove(2);
        System.out.println(m.values());
        System.out.println(m.keySet());
    }
}
