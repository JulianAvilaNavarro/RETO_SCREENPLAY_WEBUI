Feature: Logeo en la pagina Web
  Yo como cliente de la página web automationpractice.com
  deseo tener una cuenta en la pagina
  para realizar mis compras

  @Registro
  Scenario: Registro de usuario en la pagina
    Given el cliente se encuentra en la pagina de inicio para registrarse
    When el cliente ingresa la informacion necesaria para el registro en la pagina web
    Then el cliente vera el mensaje de  confirmacion del registro exitoso en la pagina

  @Logeo
  Scenario: Logeo no exitoso
    Given el cliente se encuentra en la pagina de inicio para logearse
    When el cliente ingresa su informacion para el ingreso a la pagina
    Then el cliente  debera ver que ha recibido el mensaje de que no esta registrado en la pagina


