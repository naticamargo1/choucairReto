Feature: Login

  @login
  Scenario: login exitoso
    Given como usuario de la pagina web
    When se ingresa las credenciales
      | Admin | admin123 |
    Then se realiza el login exitoso