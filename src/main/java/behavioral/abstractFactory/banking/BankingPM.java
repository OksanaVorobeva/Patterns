package behavioral.abstractFactory.banking;

import behavioral.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking PM manege project");
    }
}
