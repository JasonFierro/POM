package Pages.Web.loginWeb;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginWebPage extends BasePage {

    public loginWebPage(WebDriver driver) {
        super(driver);
    }

    private By ingresar = By.xpath("//div[@class='site-account-content']/a[.='Ingresa']");

    public void login() throws Exception {
        waitImplicit(ingresar);
        click(ingresar);
    }
}
