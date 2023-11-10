package behavioral.abstractFactory;

import behavioral.abstractFactory.webSaite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Taster taster= projectTeamFactory.getTester();
        ProjectManager projectManager= projectTeamFactory.getProjectManager();

        System.out.println("Create auction website ...");
        developer.writeCode();
        taster.testCode();
        projectManager.managerProject();

    }
}
