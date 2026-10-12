package zoo;

public class Dog extends Animal {

    public String name = "rex";
    private int id = 10;

    public Dog(String type) {
        super(type);
    }

    public void bark() {
        makeSound(); // Works
    }

    public void showDogType() {
        // its ok because you inherit the Animal class
        System.out.println(this.type);
    }
}
