                            // Prog12

public class animal {
    public void eat() {
        System.out.println("eating");
    }
    public void sleep() {
        System.out.println("Sleeping mobbu");
    }

    public static void main(String[] args) {
        animal p = new animal();
        dog d = new dog();
        cat c = new cat();
        p.eat();
        d.eat();
        c.eat();
        d.name();
    } 
}

class dog extends animal {
    String name =  "bowbow";
    void name() {
    System.out.println(name + "Printed");
    }
}
class cat extends animal {
    String name =  "meowMeow";
}
