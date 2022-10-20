package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Feature/Android/prixz.feature",
        //features = "src/main/resources/Feature/Web/loginPotal.feature",
        glue = {"StepDefinitions"},
        //plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-reports/report.html"} --> reporte basico
        plugin = {"json:report/test/cucumber_report.json"}
)

public class testRunner {

    @AfterClass
    public static void finish(){
        try {
            System.out.println("El reporte se esta generando");
            String [] cmd = {"cmd.exe","/c","npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado satisfactoriamente!!!");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
