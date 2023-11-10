package behavioral.abstractFactory.webSaite;

import behavioral.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes PHP code");
    }
}
