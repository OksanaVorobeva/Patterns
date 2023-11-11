package creational.abstractFactory.banking;

import creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking PM manege project");
    }
}
