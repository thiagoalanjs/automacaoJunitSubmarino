package WebSuporte;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;


//Abrir Chrome
public class webElementAccessNavigator {

    public static final String USERNAME = "thiagoalan1";
    public static final String AUTOMATE_KEY = "VcuZYJpaD3h56Xtzpyex";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


        public static WebDriver acessaViaChrome(){
            System.setProperty("webdriver.chrome.driver","/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/WebDriver/chromedriver");
            WebDriver driverNavigator = new ChromeDriver();
            driverNavigator.manage().window().maximize();
            driverNavigator.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driverNavigator.get("https://www.submarino.com.br/");

         return driverNavigator;
        }


    public static WebDriver createWebDriverStack(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "7");
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("resolution", "1366x768");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("browserstack.selenium_version", "3.5.2");
        WebDriver driverNavigator = null;

        try{

            driverNavigator = new RemoteWebDriver(new URL(URL), caps);
            driverNavigator.manage().window().maximize();
            driverNavigator.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driverNavigator.get("https://www.submarino.com.br/");

        }catch (Exception e){
            System.out.println("Ocorreu problemas com a URL: " + e.getMessage());
        }
        return driverNavigator;
    }
}
