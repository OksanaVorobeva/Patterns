package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Taster;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Taster getTester() {
        return new QATTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
