package org.example.pages;

import org.example.core.WebDriverProvider;

public class SitePageObject extends PageObject {

    public SitePageObject(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
    }

    public SitePageObject acessarSite() {

        getWebDriver().get("https://www.saucedemo.com/");

        return this;
    }
}
