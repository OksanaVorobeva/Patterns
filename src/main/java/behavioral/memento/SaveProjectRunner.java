package behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo= new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        githubRepo.setSave(project.save());

        System.out.println("Update project to Version 1.1");

        System.out.println("Write poor code.... ");
        project.setVersionAndDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling to back to Version 1.0");
        project.load(githubRepo.getSave());

        System.out.println("Project afte rollback");
        System.out.println(project);

    }

}
