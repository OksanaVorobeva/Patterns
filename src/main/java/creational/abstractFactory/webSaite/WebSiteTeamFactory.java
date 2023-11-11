package creational.abstractFactory.webSaite;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Taster;

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
