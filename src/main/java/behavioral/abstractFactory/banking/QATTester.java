package behavioral.abstractFactory.banking;

import behavioral.abstractFactory.Developer;
import behavioral.abstractFactory.Taster;

public class QATTester implements Taster {
    @Override
    public void testCode() {
        System.out.println("QAT tester testers banking code");
    }
}
