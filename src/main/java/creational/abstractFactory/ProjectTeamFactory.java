package creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Taster getTester();

    ProjectManager getProjectManager();
}
