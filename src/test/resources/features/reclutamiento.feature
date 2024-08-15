@Recutamiento
Feature: reclutar persona

  @agregarCanditado
  Scenario: agregar canditato
    Given como usuario de la pagina web
    When se ingresa las credenciales
      | Admin | admin123 |
    Then se realiza el login exitoso
    And seleccionamos en menu la opcion recruitment
    And seleccionamos el boton add
    And llenamos el formulario de add cantidate
      | Lizeth | Natalia | Camargo | nati23camargo@gmail.com | 3124357811 | nati23choucair |
    And seleccionamos el boton save
    Then validamos que el status este en Application Initiated

  @canditadoPreseleccionado
  Scenario: canditado Preseleccionado
    Given como usuario de la pagina web
    When se ingresa las credenciales
      | Admin | admin123 |
    Then se realiza el login exitoso
    And seleccionamos en menu la opcion recruitment
    And buscamos la palabra clave en el filtro de cantidatos "nati23choucair"
    And seleccionamos el boton buscar
    And seleccionamos la opcion ver en el recurso encontrado
    And seleccionamos el boton dos
    And seleccionamos el boton save
    Then validamos que el estado este en preseleccionada


  @CantidatoParaEntrevista
  Scenario: Programar entresvita
    Given como usuario de la pagina web
    When se ingresa las credenciales
      | Admin | admin123 |
    Then se realiza el login exitoso
    And seleccionamos en menu la opcion recruitment
    And buscamos la palabra clave en el filtro de cantidatos "nati23choucair"
    And seleccionamos el boton buscar
    And seleccionamos la opcion ver en el recurso encontrado
    And seleccionamos el boton dos
    And llenamos el formulario de progracion de entresvita
      | Entrevista Natalia | james | 2024-15-08 |
    And seleccionamos el boton save
    Then validamos que el estado este entrevista programada

  @EntrevistaAprobada
  Scenario: Entrevista Aprobada
    Given como usuario de la pagina web
    When se ingresa las credenciales
      | Admin | admin123 |
    Then se realiza el login exitoso
    And seleccionamos en menu la opcion recruitment
    And buscamos la palabra clave en el filtro de cantidatos "nati23choucair"
    And seleccionamos el boton buscar
    And seleccionamos la opcion ver en el recurso encontrado
    And seleccionamos el boton dos
    And seleccionamos el boton save
    Then validamos que el estado este entrevista aprobada

  @Contratacion
  Scenario: Canditado Contratado
    Given como usuario de la pagina web
    When se ingresa las credenciales
      | Admin | admin123 |
    Then se realiza el login exitoso
    And seleccionamos en menu la opcion recruitment
    And buscamos la palabra clave en el filtro de cantidatos "nati23choucair"
    And seleccionamos el boton buscar
    And seleccionamos la opcion ver en el recurso encontrado
    And seleccionamos el boton oferta de trabajo
    And seleccionamos el boton save
    And seleccionamos el boton contratado
    And seleccionamos el boton save
    Then validamos que el estado este en contratado

