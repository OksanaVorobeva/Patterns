package behavioral.abstractFactory.banking;

import behavioral.abstractFactory.Developer;
import behavioral.abstractFactory.ProjectManager;
import behavioral.abstractFactory.ProjectTeamFactory;
import behavioral.abstractFactory.Taster;

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
