$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Web/loginPotal.feature");
formatter.feature({
  "line": 1,
  "name": "Como usuario del portal dev.prixz quiero autenticarme en el login para poder acceder a las funcionalidades del rol actual.",
  "description": "",
  "id": "como-usuario-del-portal-dev.prixz-quiero-autenticarme-en-el-login-para-poder-acceder-a-las-funcionalidades-del-rol-actual.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Ingresar al login del portal dev.prixz",
  "description": "",
  "id": "como-usuario-del-portal-dev.prixz-quiero-autenticarme-en-el-login-para-poder-acceder-a-las-funcionalidades-del-rol-actual.;ingresar-al-login-del-portal-dev.prixz",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "el usuario debe estar en la página de login",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 7,
      "value": "#    When se ingresa el usuario dev \"\u003cusuario\u003e\""
    },
    {
      "line": 8,
      "value": "#    And se ingresa la contraseña dev \"\u003ccontrasena\u003e\""
    },
    {
      "line": 9,
      "value": "#    And se presiona el botón Iniciar sesion dev"
    },
    {
      "line": 10,
      "value": "#    Then se mostrará la pantalla principal del portal Dispapeles"
    }
  ],
  "line": 11,
  "name": "",
  "description": "",
  "id": "como-usuario-del-portal-dev.prixz-quiero-autenticarme-en-el-login-para-poder-acceder-a-las-funcionalidades-del-rol-actual.;ingresar-al-login-del-portal-dev.prixz;",
  "rows": [
    {
      "cells": [
        "usuario",
        "contrasena"
      ],
      "line": 12,
      "id": "como-usuario-del-portal-dev.prixz-quiero-autenticarme-en-el-login-para-poder-acceder-a-las-funcionalidades-del-rol-actual.;ingresar-al-login-del-portal-dev.prixz;;1"
    },
    {
      "cells": [
        "jasonfierro@yopmail.com",
        "Colombia2021*"
      ],
      "line": 13,
      "id": "como-usuario-del-portal-dev.prixz-quiero-autenticarme-en-el-login-para-poder-acceder-a-las-funcionalidades-del-rol-actual.;ingresar-al-login-del-portal-dev.prixz;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 20231383300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Ingresar al login del portal dev.prixz",
  "description": "",
  "id": "como-usuario-del-portal-dev.prixz-quiero-autenticarme-en-el-login-para-poder-acceder-a-las-funcionalidades-del-rol-actual.;ingresar-al-login-del-portal-dev.prixz;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "el usuario debe estar en la página de login",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_Login_Web.el_usuario_debe_estar_en_la_página_de_login()"
});
formatter.result({
  "duration": 6397514400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 885969300,
  "status": "passed"
});
});