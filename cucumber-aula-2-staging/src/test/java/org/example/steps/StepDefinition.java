package org.example.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.example.core.Metodos;
import org.example.pages.LoginObject;


public class StepDefinition {


    LoginObject loginObject = new LoginObject();
    Metodos metodos = new Metodos();

    @Dado("que eu esteja no site")
    public void que_eu_esteja_no_site() {
        metodos.abrirNavegado("https://www.saucedemo.com/");
    }


    @Quando("realizo login com o usuario valido")
    public void realizo_login_com_o_usuario_valido() {
        metodos.escrever(loginObject.getUserName(), "standard_user");
        metodos.escrever(loginObject.getPassword(), "secret_sauce");
        metodos.clicar(loginObject.getLogin());
    }

    @Entao("conseguirei logar no site")
    public void conseguirei_logar_no_site() {
        metodos.validarTexto(loginObject.getValidarLogin(),"PRODUCTS");
        metodos.fecharNavegador();
    }

    @Quando("realizo login com o usuario invalido")
    public void realizo_login_com_o_usuario_invalido() {
        metodos.escrever(loginObject.getUserName(), "marcia_user");
        metodos.escrever(loginObject.getPassword(), "secret_123");
        metodos.clicar(loginObject.getLogin());
    }

    @Entao("vizualizarei a mensagem de alerta")
    public void vizualizarei_a_mensagem_de_alerta() {
        metodos.validarTexto(loginObject.getErro(), "Epic sadface: Username and password do not match any user in this service");
        metodos.fecharNavegador();
    }
}

