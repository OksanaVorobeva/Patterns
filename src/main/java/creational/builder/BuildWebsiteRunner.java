package creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuilder(new EnterPriseWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
