import java.util.*;
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;

public class prog34 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        System.out.println(s);
        s.add(3,"6");
        s.remove("4");
        s.set(0, "used set here");
        System.out.println(s);
        System.out.println(s.get(2));
        Collections.reverse(s);
        System.out.println(s);
    }
}
