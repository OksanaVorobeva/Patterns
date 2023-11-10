package behavioral.abstractFactory.banking;

import behavioral.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
