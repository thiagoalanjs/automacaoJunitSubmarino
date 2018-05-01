package WebSuporte;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.poi.hslf.usermodel.PictureData;
import org.apache.poi.xslf.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Screenshot {
    public static void tirarPrintdaTela(WebDriver driverNavigator, String arquivo){

        File screenshot = ((TakesScreenshot)driverNavigator).getScreenshotAs(OutputType.FILE);

        try{

            FileUtils.copyFile(screenshot, new File(arquivo));

        }

        catch (Exception errorMessage){
            System.out.println("Erro ao enviar arquivo para pasta: " + errorMessage.getMessage());

        }
    }
}
