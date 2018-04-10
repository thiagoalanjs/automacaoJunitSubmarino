package pages;

import org.openqa.selenium.WebDriver;

import java.io.StringWriter;

public class BaseUrl {
    protected WebDriver driverNagator;
    protected String PathPictures;


    public BaseUrl(WebDriver driverNagator){
        this.driverNagator = driverNagator;
    }
}
