package animal;

public class Hamster extends Animal {
    public Hamster(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("vau vau");
    }
}
