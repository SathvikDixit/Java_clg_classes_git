class Dog {
        String DogColor = "brown";
        String breed = "Beligium Malmoa";

        public void bark() {
            System.out.println("Dog is Barking");
            System.out.println(DogColor);
            System.out.println(breed);
        }
        public void run() {
            System.out.println("Dog is Runing");
            System.out.println(DogColor);
            System.out.println(breed);
        }
        public static void main(String[] args) {
        // Dog.bark();
        // Dog.run();
        Dog d = new Dog();
        d.bark();
        d.run();
    }
} 
    

