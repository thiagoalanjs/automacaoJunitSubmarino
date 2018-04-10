package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementosHomePage extends BaseUrl{
    public ElementosHomePage(WebDriver driverNagator) {
        super(driverNagator);
    }


    public ElementosBuscaPage CampoBuscaProduto(String campoBusca){
        //Digita nome produto
        driverNagator.findElement(By.id("h_search-input")).sendKeys(campoBusca);
        //clica botao buscar
        driverNagator.findElement(By.id("h_search-btn")).click();

        return new ElementosBuscaPage(driverNagator);
    }


}
