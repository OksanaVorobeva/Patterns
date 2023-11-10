package behavioral.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Taster getTester();

    ProjectManager getProjectManager();
}
