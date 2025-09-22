//9/20/25
// s.n

public class Constructor {
    public static void main(String[] args) {
        Dog mydog = new Dog ("George", 33);
        System.out.println(mydog.name + " is " + mydog.age);
        //an example of why this code wouldn't work (because the method is private meaning it can't be used outside of the class
        //Constants myConstants = new Constants();
        System.out.println(Constants.MY_NAME);
    }
}