public class prog11 {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        p.care();
        c.care();
        c.love();
        
    }
}
class Parent {
    public void care() {
        System.out.println("Caring");
    }

    public void love() {
        System.out.println("Loving");
    }
    public void creditCard () {
        System.out.println("XXXX XXXX X234");
    }
}

class Child extends Parent {
    String name = "Pranav";
}

        // Code is correct but this shit insn't working




//         class Parent {
//     public void care() {
//         System.out.println("Caring");
//     }

//     public void love() {
//         System.out.println("Loving");
//     }
//     private void creditCard () {
//         System.out.println("XXXX XXXX X234");
//     }
//     public static void main(String[] args) {
//         Child c = new Child();
//         Parent p = new Parent();
//         p.care();
//         c.care();
//         c.love();
//         // c.creditCard();
//         p.creditCard();
        
//     }
// }

// class Child extends Parent {
//     String name = "Pranav";
// }
                        // this shit is to access creditCard details only by parent not by child





// class Parent {
//     public void care() {
//         System.out.println("Caring");
//     }

//     public void love() {
//         System.out.println("Loving");
//     }
//     private void creditCard () {
//         System.out.println("XXXX XXXX X234");
//     }
//     public static void main(String[] args) {
//         Child c = new Child();
//         Parent p = new Parent();
//         p.care();
//         c.care();
//         c.love();
//         // c.creditCard();
//         p.creditCard();
//         c.shit();
//         p.shit();
        
//     }
// }

// class Child extends Parent {
//     String name = "Pranav";
//     public void shit() {
//         System.out.println("This shit is angry dude...");
//     }
// }  
                                    // Making class only accessed by child not by parent


