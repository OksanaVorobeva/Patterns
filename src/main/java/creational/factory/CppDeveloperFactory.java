package creational.factory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer creatDeveloper() {
        return new CPPDeveloper();
    }
}
