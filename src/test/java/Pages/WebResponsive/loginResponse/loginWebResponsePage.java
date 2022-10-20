package Pages.WebResponsive.loginResponse;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginWebResponsePage extends BasePage {

    public loginWebResponsePage(WebDriver driver) {
        super(driver);
    }

    private By ingresar = By.xpath("//div[@class='site-account-content']/a[.='Ingresa']");

    public void login() throws Exception {
        waitImplicit(ingresar);
        click(ingresar);
    }
}
