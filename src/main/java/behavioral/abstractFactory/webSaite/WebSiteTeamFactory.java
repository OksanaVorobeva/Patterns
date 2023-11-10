package behavioral.abstractFactory.webSaite;

import behavioral.abstractFactory.Developer;
import behavioral.abstractFactory.ProjectManager;
import behavioral.abstractFactory.ProjectTeamFactory;
import behavioral.abstractFactory.Taster;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Taster getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
