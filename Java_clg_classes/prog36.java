import java.util.*;

public class prog36 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        // ArrayList<Integer> a = new ArrayList<>();
        // a.add(1);
        // a.add(2);
        // a.add(3);
        // a.add(4);
        // a.add(5);
        // System.out.println(a);
        HashSet<Integer> h = new HashSet<>();
        h.add(4);
        h.add(4);
        h.add(2);
        System.out.println(h);
        System.out.println(s.retainAll(h));
        System.out.println(s);
        
    }
}
