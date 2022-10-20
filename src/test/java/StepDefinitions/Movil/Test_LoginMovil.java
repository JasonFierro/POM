package StepDefinitions.Movil;

import Runner.browser_manager.DriverManager;
import StepDefinitions.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_LoginMovil extends TestBase {

    @Given("^el usuario debe estar en la página principal$")
    public void el_usuario_debe_estar_en_la_página_principal() throws Throwable {
        LoginPage.iconLogin();
    }

    @And("^Seleccionar icono de login$")
    public void seleccionar_icono_de_login() throws Throwable {
        //LoginPage.iconLogin();
    }

    @When("^se ingresa el usuario \"([^\"]*)\"$")
    public void se_ingresa_el_usuario(String usuario) throws Throwable {
        ;
    }

    @When("^se ingresa la contraseña \"([^\"]*)\"$")
    public void se_ingresa_la_contraseña(String contrasena) throws Throwable {
        ;
    }

    @When("^se presiona el botón Iniciar sesion$")
    public void se_presiona_el_botón_Iniciar_sesion() throws Throwable {
        ;
    }

    @Then("^se mostrará la pantalla principal de Prixz$")
    public void se_mostrará_la_pantalla_principal_de_Prixz() throws Throwable {
        ;
    }

}
