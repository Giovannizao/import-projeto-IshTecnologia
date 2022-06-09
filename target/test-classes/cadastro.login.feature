#Author: giovanni.victor@hotmail.com




@cadastro
Feature: Acessar o site
Eu como usuario quero acessar o site para me cadastrar e efetuar um login


  Scenario: Realizar o cadastro de usuario 
    Given desejo realizar um cadastro   
    When efetuo o cadastro
    Then valido o cadastro
 
 @login
 
 
 Scenario: Realizar Login
 Given preencho o formulario
 When efetuo o login
 Then valido o login