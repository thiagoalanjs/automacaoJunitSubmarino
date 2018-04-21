package WebSuporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {
    public static void tirar(WebDriver driverNagator, String arquivo){
            File screenshot = ((TakesScreenshot)driverNagator).getScreenshotAs(OutputType.FILE);
            try{
                FileUtils.copyFile(screenshot, new File(arquivo));
            }catch(Exception msgError){
                System.out.println("Ocorreu erro no envio de arquivo para pasta: " + msgError.getMessage());
            }
    }

}
