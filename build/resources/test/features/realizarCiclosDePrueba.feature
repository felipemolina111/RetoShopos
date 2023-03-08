Feature: Realizar ciclos de prueba
  Scenario: Realizar ciclos de pruebaexitoso
    Given el usuario se encuentra en la pagina de inicio
    When el usuario ingrese el usuario, contraseña y de click en el botón ingresar
    When  el usuario realiza las ejecuciones de los ciclos
    Then el usuario valida el mensaje exitoso