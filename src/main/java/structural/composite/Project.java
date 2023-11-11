package structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team= new Team();

        Developer firestJavaDeveloper = new  JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firestJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
