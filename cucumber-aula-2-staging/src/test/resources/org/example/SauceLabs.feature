#language: pt
Funcionalidade: Login no site

  @webdriver
  Cenario: Realizar login no site
    Dado que eu esteja no site
    Quando realizo login com o usuario valido
    Entao conseguirei logar no site


  Cenario: Realizar login com informacoes invalidas
    Dado que eu esteja no site
    Quando realizo login com o usuario invalido
    Entao vizualizarei a mensagem de alerta




