package animal;

public class Circus {
    private static int animalCount = 0;

    public static void main(String[] args) {
        Hamster hamster = new Hamster("ret");
        animalCount++;
        hamster.addNickname("hercseg");
        hamster.makeSound();
        System.out.println("Hamster name: " + hamster.getName());
        System.out.println("Hamster nickname: " +hamster.getNicknames());

        Dog dog = new Dog("gugya");
        animalCount++;
        dog.addNickname("Java 20");
        dog.addNickname("JDK 20");
        dog.makeSound();
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog nickname: " + dog.getNicknames());

        Cat cat = new Cat("szisza");
        animalCount++;
        cat.addNickname("Princess of Dragonstone, Queen of the Seven Kingdoms, " +
                "the Unburnt, Queen of Meereen, Queen of the Andals and the Rhoynar and the First Men, " +
                "Khaleesi of Great Grass Sea, Breaker of Shackles, and Mother of Dragons Lord of the " +
                "Seven Kingdoms Protector of the Realm");

        cat.makeSound();
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat nickname: " + cat.getNicknames());

        System.out.println(animalCount);
    }
}
