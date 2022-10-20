package StepDefinitions;

import Runner.browser_manager.DriverManager;
import Runner.browser_manager.DriverManagerFactory;
import Runner.browser_manager.DriverType;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Capabilities {

    private static AppiumDriver driverAppium;
    private static WebDriver driverWeb;
    private static int numberOfCase = 0;
    private DriverManager driverManager;
    private String web = "";
    private String app = "Android";

    @Before
    public void setUp() throws MalformedURLException {
        if (app.equals("Android")){
        try {
            numberOfCase++;
            System.out.println("Se está ejecutando el escenario #" + numberOfCase);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println("Fecha y hora de ejecución: "+dtf.format(LocalDateTime.now()));
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            //cap.setCapability("automationName", "UiAutomator2");
            cap.setCapability("platformVersion", "12");
            cap.setCapability("deviceName", "emulator-5556");
            cap.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/app-release.apk");
            cap.setCapability("appPakage", "com.prixzsc.app");
            cap.setCapability("appActivity", "com.prixzsc.app.MainActivity");
            driverAppium = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
            //URL url = new URL("http://127.0.0.1:4723/wd/hub");
            //driver = new AndroidDriver<MobileElement>(url,cap);
            driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception e){
            System.out.println("La causa es: "+e.getCause());
            System.out.println("El mensaje es: "+e.getMessage());
            e.printStackTrace();
        }
        }

        if (!web.isEmpty()){
            try {
                numberOfCase++;
                System.out.println("Se está ejecutando el escenario #" + numberOfCase);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                System.out.println("Fecha y hora de ejecución: " + dtf.format(LocalDateTime.now()));
                driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
                driverWeb = driverManager.getDriver();
                driverWeb.get("https://sandbox.prixz.com/ ");
                if (web.equals("responsive")) {
                    driverWeb.manage().window().setSize(new Dimension(510, 851));
                } else {
                    driverWeb.manage().window().maximize();
                }
                driverWeb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            } catch (Exception e){
                System.out.println("La causa es: "+e.getCause());
                System.out.println("El mensaje es: "+e.getMessage());
                e.printStackTrace();
            }
        }
    }

    //@Test
    public void click_App_Button() throws InterruptedException {
        // code
//        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Pestaña 4 de 5']")).click(); SI
//        driver.findElementByXPath("//android.widget.ImageView[@content-desc='Pestaña 4 de 5']").click(); SI
        //Thread.sleep(5000);
        //driver.findElementByAccessibilityId("Pestaña 4 de 5").click(); NO
        //WebElement login = driver.findElement(By.xpath("//*[@id=\"sourceContainer\"]/div/div[2]/div/div/div[34]/span[3]/span/span/span/span/text()[2]")); NO
        //MobileElement login = (MobileElement) driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='Pestaña 4 de 5']")); NO
        //login.click();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (null != driverAppium) {
            System.out.println("El escenario # "+ numberOfCase +" se ejecutó correctamente");
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriverAppium()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "android/png");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println("Fecha y hora ejecución finalizada: "+dtf.format(LocalDateTime.now()));
            System.out.println("");
            System.out.println("");
            driverManager.quitDriverMovil();
        } else if (null != driverWeb){
            System.out.println("El escenario # "+ numberOfCase +" se ejecutó correctamente");
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "web/png");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println("Fecha y hora ejecución finalizada: "+dtf.format(LocalDateTime.now()));
            System.out.println("");
            System.out.println("");
            driverManager.quitDriverWeb();
        }
    }

    public static AppiumDriver getDriver(){
        return driverAppium;
    }

    public static WebDriver getDriverWeb(){
        return driverWeb;
    }

}
