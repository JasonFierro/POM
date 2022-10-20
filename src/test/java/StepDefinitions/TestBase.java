package StepDefinitions;

import Pages.Android.modLogin.loginAndroid;
import Pages.Web.loginWeb.loginWebPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class TestBase {

    //--------------------------APP----------------------------------
    protected AppiumDriver driverAppium = Capabilities.getDriver();
    protected loginAndroid LoginPage = new loginAndroid(driverAppium);

    //--------------------------WEB----------------------------------
    protected WebDriver driverWeb = Capabilities.getDriverWeb();
    protected loginWebPage LoginWebPage = new loginWebPage(driverWeb);

}