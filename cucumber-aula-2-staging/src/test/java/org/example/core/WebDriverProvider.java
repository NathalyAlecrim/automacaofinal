package org.example.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class WebDriverProvider {

    private WebDriver webDriver;

    public void start() {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public void close() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
