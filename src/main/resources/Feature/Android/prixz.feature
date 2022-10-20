Feature: Como usuario del portal Prixz quiero autenticarme en el login para poder acceder a las compras.

  @Login
  Scenario Outline: Ingresar al login de la APP Prixz Dev

    Given el usuario debe estar en la página principal
#    And Seleccionar icono de login
#    When se ingresa el usuario "<usuario>"
#    And se ingresa la contraseña "<contrasena>"
#    And se presiona el botón Iniciar sesion
#    Then se mostrará la pantalla principal de Prixz
    Examples:
      | usuario           | contrasena   |
      | jfierro@pirxz.com | Jadrez0323-* |