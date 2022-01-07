package org.example.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class Metodos {

    private static WebDriver driver;

    public static WebDriver driver() {
        return driver;

    }

    public void clicar(By elemento) {
        driver().findElement(elemento).click();
    }

    public void escrever(By elemento, String texto) {
        driver.findElement(elemento).sendKeys(texto);
    }

    public static void abrirNavegado(String site) {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(site);
        driver.manage().window().maximize();
    }

    public void validarTexto(By elemento, String textoEsperado) {
        String texto = driver.findElement(elemento).getText();
        assertEquals(textoEsperado, texto);
    }

    public void fecharNavegador() {
        driver.quit();
    }
}
