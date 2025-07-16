                            // Abstract Class

abstract class prog21 {

    abstract void sound();

    public void eat() {
        System.out.println("Eat.");
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        prog21 p = new Dog();
        p.eat();
    }
}

class Dog extends prog21 {
    public void sound() {
        System.out.println("Dog Barks");
    }
}
 
