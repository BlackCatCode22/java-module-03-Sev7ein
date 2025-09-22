public class Dog {
//using this is not allowed in static lines
    private String name;
    private int age;
    // constructor line must be the first line or it won't work
    public Dog() {
        this("Fido", 0);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void bark() {
        System.out.println("Bark");
    }
}

