package org.example.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.core.WebDriverProvider;

public class DriverLifecycleHook {

    private final WebDriverProvider webDriverProvider;

    public DriverLifecycleHook(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    @Before("@webdriver")
    public void startWebDriver() {
        webDriverProvider.start();
    }

    @After("@webdriver")
    public void closeWebDriver() {
        webDriverProvider.close();
    }
}
