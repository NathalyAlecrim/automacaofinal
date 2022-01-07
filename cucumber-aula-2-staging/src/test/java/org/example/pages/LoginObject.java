package org.example.pages;

import org.example.core.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginObject {

   private By userName = By.xpath("//*[@id=\"user-name\"]");
   private By password = By.xpath("//*[@id=\"password\"]");
   private By login = By.xpath("//*[@id=\"login-button\"]");
   private By erro = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
   private By validarLogin = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

 public By getUserName() {
    return userName;
 }
 public By getPassword() {
    return password;
 }
 public By getLogin() {
     return login;
 }
 public By getErro(){return erro;}
 public By getValidarLogin(){return validarLogin;}
}
