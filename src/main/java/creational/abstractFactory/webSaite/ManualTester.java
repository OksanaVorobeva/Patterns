package creational.abstractFactory.webSaite;

import creational.abstractFactory.Taster;

public class ManualTester implements Taster {
    @Override
    public void testCode() {
        System.out.println("Manual tester testers banking code");
    }
}
