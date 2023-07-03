package animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private final String name;
    private final List<String> nicknames;

    public Animal(String name) {
        this.name = name;
        this.nicknames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void addNickname(String nickname) {
        nicknames.add(nickname);
    }

    public abstract void makeSound();
}

