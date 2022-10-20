package Pages.Android.modLogin;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class loginAndroid extends BasePage {

    public loginAndroid(AppiumDriver driver) {
        super(driver);
    }

    By txtServicios = By.xpath("(//*[@id=\"sourceContainer\"]/div/div[2]/div/div/div[21]/span[3]/span/span/span/span/text()[2]");
    By btnLogin = By.xpath("//android.widget.ImageView[@content-desc=\"Pestaña 4 de 5\"]");


    public void pagePrincipal() throws Exception {
        textEquals("Ver Todos",txtServicios);
    }

    public void iconLogin() throws Exception {
        waitImplicit(btnLogin);
        click(btnLogin);
        Thread.sleep(5000);
    }


}
