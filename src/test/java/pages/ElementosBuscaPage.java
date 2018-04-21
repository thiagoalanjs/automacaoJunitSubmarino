package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ElementosBuscaPage extends BaseUrl {
    public ElementosBuscaPage(WebDriver driverNagator) {
        super(driverNagator);
    }

    public ElementosBuscaPage validaRetornoDeBusca(String nomeRetornoProduto) {

        WebElement mensagemQtdProdutos = driverNagator.findElement(By.cssSelector("h1.page-title"));
        String comparaQuantidade = mensagemQtdProdutos.getText();
        Assert.assertEquals(comparaQuantidade, nomeRetornoProduto);


        return this;
    }

    public ElementosBuscaPage comboProdutos(String listCombo) throws InterruptedException {
        WebElement comboOpcoes = driverNagator.findElement(By.xpath("//select[@type='select']"));
        new Select(comboOpcoes).selectByVisibleText(listCombo);
        TimeUnit.SECONDS.sleep(3);

        return this;
    }


    public ElementosEspecificacaoProduto produtoEscolhido(String nomeProdutoEscolhidoMassa) throws InterruptedException {

        WebElement elementoProduto = driverNagator.findElement(By.xpath("//h1[@class='card-product-name' and contains(text(), '" + nomeProdutoEscolhidoMassa + "')]"));

        TimeUnit.SECONDS.sleep(5);

        //JavascriptExecutor js = (JavascriptExecutor) driverNagator;
        //js.executeScript("arguments[0].scrollIntoView();", elementoProduto);

        elementoProduto.click();

        TimeUnit.SECONDS.sleep(5);
       return new ElementosEspecificacaoProduto(driverNagator);

    }
}