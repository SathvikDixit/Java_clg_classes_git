            // Prog23
// interface prog23 {
//     void start();
//     void stop();
// }

// class Car implements prog23 {
//     public void start() {
//         System.out.println("Car starts.");
//     }
//     public void stop() {
//         System.out.println("Car stops.");
//     }
// }
// class MainProg23 {
//     public static void main(String[] args) {
//         prog23 p = new Car();
//         p.start();
//         p.stop();
//     }
// }





            // Prog23
interface prog23 {
    void start();
    void stop();
}

class Bike implements prog23 {
    public void start() {
        System.out.println("Bike starts.");
    }
    public void stop() {
        System.out.println("Bike stops.");
    }
}
class MainProg23 {
    public static void main(String[] args) {
        prog23 p = new Bike();
        p.start();
        p.stop();
    }
}