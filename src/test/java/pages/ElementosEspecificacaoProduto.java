package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ElementosEspecificacaoProduto extends BaseUrl{
    public ElementosEspecificacaoProduto(WebDriver driverNagator) {
        super(driverNagator);
    }


    public ElementosEspecificacaoProduto valorDoProduto(String valorDoProdutoEspeficicacaoMassa){

         WebElement valor = driverNagator.findElement(By.xpath("//p[@class='sales-price']"));
        String ValorTexto = valor.getText();
        Assert.assertEquals(valorDoProdutoEspeficicacaoMassa, ValorTexto);

        return this;
    }

    public ElementosEspecificacaoProduto clicaBotaoComprar(){
        return this;
    }
}
