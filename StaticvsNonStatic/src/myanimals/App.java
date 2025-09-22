package myanimals;
// 9/20/25
// s.n

public class App {
    public static void main(String[] args) {
        //static is used to call from the class not the objects
        Cat cat1 = new Cat("Whiskers");
        Dog dog1 = new Dog("Buddy");
        Cat cat2 = new Cat("Luna");

        // Show how many animals exist
        System.out.println("Total animals created: " + Animal.getNumOfAnimals());
    }
}
