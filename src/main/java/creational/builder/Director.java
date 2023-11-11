package creational.builder;

public class Director {

    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCMS();
        websiteBuilder.buildPrice();

        Website website=websiteBuilder.getWebsite();

        return website;
    }
}
