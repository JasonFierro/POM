package Runner.browser_manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    protected AppiumDriver driverAppium;

    protected abstract void createDriver();

    public void quitDriverWeb() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public void quitDriverMovil() {

        if (driverAppium != null) {
            driverAppium.quit();
            driverAppium = null;
        }
    }

        public AppiumDriver getDriverAppium () {
            if (driverAppium == null) {
                createDriver();
            }
            return driverAppium;
        }
}
