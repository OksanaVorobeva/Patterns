package behavioral.abstractFactory.webSaite;

import behavioral.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Web PM manege project");
    }
}
