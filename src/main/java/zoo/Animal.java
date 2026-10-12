package zoo;

public class Animal {
    protected String type;

    public Animal(String type) {
        this.type = type;
    }

    protected void makeSound() {
        System.out.println("Animal sound");
    }
}
