public class prog15 {
    public void intro() {
        System.out.println("Introduction to Birds.");
    }
    public void fly() {
        System.out.println("Most birds can fly.");
    }

    public static void main(String[] args) {
        prog15 p = new prog15();
        p.intro();
        kingfisher k = new kingfisher();
        k.fly();
        penguin pe = new penguin();
        pe.fly();
    }
}

class kingfisher extends prog15{
    public void fly() {
        System.out.println("Kingfisher can fly");
    }
}

class penguin extends prog15 {
    public void fly() {
        System.out.println("Penguin cannot fly");
    }
}