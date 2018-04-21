package WebSuporte;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


//Abrir Chrome
public class webElementAccessNavigator {
    public static WebDriver acessaViaChrome(){
        System.setProperty("webdriver.chrome.driver","/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/WebDriver/chromedriver");
        WebDriver driverNavigator = new ChromeDriver();
        driverNavigator.manage().window().maximize();
        driverNavigator.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driverNavigator.get("https://www.submarino.com.br/");

     return driverNavigator;
    }
}
