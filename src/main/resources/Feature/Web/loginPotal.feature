Feature: Como usuario del portal dxxx quiero autenticarme en el login para poder acceder a las funcionalidades del rol actual.

  @Login
  Scenario Outline: Ingresar al login del portal xxxx

    Given el usuario debe estar en la página de login
#    When se ingresa el usuario dev "<usuario>"
#    And se ingresa la contraseña dev "<contrasena>"
#    And se presiona el botón Iniciar sesion
#    Then se mostrará la pantalla principal del portal Dispapeles
    Examples:
      | usuario                 | contrasena      |
