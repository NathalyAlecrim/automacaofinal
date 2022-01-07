package org.example.pages;

import org.example.core.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class PageObject {

    private final WebDriverProvider webDriverProvider;

    public PageObject(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;

        // Configuracoes

        webDriverProvider.getWebDriver().manage().window().fullscreen();
        webDriverProvider.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Iniciar page factory

        PageFactory.initElements(webDriverProvider.getWebDriver(), this);
    }

    public WebDriver getWebDriver() {
        return webDriverProvider.getWebDriver();
    }
}
