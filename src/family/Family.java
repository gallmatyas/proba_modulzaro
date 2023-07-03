package family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private final String name;
    private final List<Family> parents;

    public Family(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Family> getParents() {
        return parents;
    }

    public void addParent(Family parent) {
        parents.add(parent);
    }

    public void printFamilyTree() {
        System.out.print(name);
    }
}