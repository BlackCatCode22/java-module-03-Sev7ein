public class Cat extends Animal{

    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference) {
        //trying to pass in any strings or etc that arent defined will result in an error
        // calling the super class constructors can only be used inside the subclass constructors
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }
    @Override
    public void makeNoise() {
        //first calls the parent class then continues on to call the cat's noise
        super.makeNoise();
        System.out.println("Meow meow meow!");

        eat();
    }
    public void jump() {
        super.makeNoise();
    }
}
