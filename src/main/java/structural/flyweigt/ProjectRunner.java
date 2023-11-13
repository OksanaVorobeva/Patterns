package structural.flyweigt;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers =new ArrayList<>();
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));

        for (Developer developer:developers) {
            developer.writeCode();
        }

    }
}
