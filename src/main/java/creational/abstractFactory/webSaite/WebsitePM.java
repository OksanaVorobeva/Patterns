package creational.abstractFactory.webSaite;

import creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Web PM manege project");
    }
}
