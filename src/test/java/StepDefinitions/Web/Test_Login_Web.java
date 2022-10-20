package StepDefinitions.Web;

import StepDefinitions.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Login_Web extends TestBase {


    @Given("^el usuario debe estar en la página de login$")
    public void el_usuario_debe_estar_en_la_página_de_login() throws Throwable {
        LoginWebPage.login();
    }

//    @When("^se ingresa el usuario dev \"([^\"]*)\"$")
//    public void se_ingresa_el_usuario_dev(String arg1) throws Throwable {
//           ;
//    }
//
//    @When("^se ingresa la contraseña dev \"([^\"]*)\"$")
//    public void se_ingresa_la_contraseña_dev(String arg1) throws Throwable {
//        ;
//    }
//
//    @When("^se presiona el botón Iniciar sesion dev$")
//    public void se_presiona_el_botón_Iniciar_sesion_dev() throws Throwable {
//        ;
//    }
//
//    @Then("^se mostrará la pantalla principal del portal Dispapeles$")
//    public void se_mostrará_la_pantalla_principal_del_portal_Dispapeles() throws Throwable {
//        ;
//    }

}
