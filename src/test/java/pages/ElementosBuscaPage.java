package pages;
import WebSuporte.Generator;
import WebSuporte.Screenshot;
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

        //String arquivoEvidenciaBuscaPage1 = "/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/Evidencias/" + Generator.dataHoraDoParaArquivoTeste() + ".png";
        //Screenshot.tirarPrintdaTela(driverNagator,arquivoEvidenciaBuscaPage1);


        TimeUnit.SECONDS.sleep(3);

        //JavascriptExecutor js = (JavascriptExecutor) driverNagator;
        //js.executeScript("arguments[0].scrollIntoView();", elementoProduto);

       // String arquivoEvidenciaBuscaPage2 = "/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/Evidencias/" + Generator.dataHoraDoParaArquivoTeste() + ".png";
       // Screenshot.tirarPrintdaTela(driverNagator,arquivoEvidenciaBuscaPage2);

        elementoProduto.click();
        // String arquivoEvidenciaBuscaPage3 = "/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/Evidencias/" + Generator.dataHoraDoParaArquivoTeste() + ".png";
        // Screenshot.tirarPrintdaTela(driverNagator,arquivoEvidenciaBuscaPage3);


        return new ElementosEspecificacaoProduto(driverNagator);

    }
}