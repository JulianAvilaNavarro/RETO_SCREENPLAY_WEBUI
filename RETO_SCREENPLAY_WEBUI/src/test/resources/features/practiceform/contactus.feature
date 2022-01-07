Feature: Contacto con pagina Web
  Yo como cliente de la página web automationpractice.com
   deseo enviar un mensaje
  para realizar consultas a la empresa

  @contactoSC
  Scenario: Mensaje a servicio al cliente
    Given el cliente se encuentra en la pagina de inicio para escribir a servicio al cliente
    When el cliente realizara envia un mensaje para conocer ofertas adicionales
    Then el cliente  debera ver que ha recibido el mensaje de confirmacion de confirmacion consulta a servicio al cliente

  @contactoAW
  Scenario: Mensaje al administrador web de la pagina
    Given el cliente se encuentra en la pagina de inicio para escribir al administrador
    When el cliente realizara el proceso para enviar un mensaje vacio
    Then el cliente  debera ver que ha recibido el mensaje de error



