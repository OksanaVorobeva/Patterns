package creational.builder;

public class EnterPriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCMS() {
        website.setCms(CMS.ALITRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
