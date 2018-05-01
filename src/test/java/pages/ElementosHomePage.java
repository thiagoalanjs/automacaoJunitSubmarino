package pages;

import WebSuporte.Generator;
import WebSuporte.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ElementosHomePage extends BaseUrl{
    public ElementosHomePage(WebDriver driverNagator) {
        super(driverNagator);
    }


    public ElementosBuscaPage CampoBuscaProduto(String campoBusca) {
        //Digita nome produto
        driverNagator.findElement(By.id("h_search-input")).sendKeys(campoBusca);

       // String arquivoEvidenciaHomePage1 = "/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/Evidencias/" + Generator.dataHoraDoParaArquivoTeste() + ".png";
       // Screenshot.tirarPrintdaTela(driverNagator,arquivoEvidenciaHomePage1);

        //clica botao buscar
        driverNagator.findElement(By.id("h_search-btn")).click();

       // String arquivoEvidenciaHomePage2 = "/home/thiago/Área de Trabalho/automacaoJunitSubmarino/src/test/Evidencias/" + Generator.dataHoraDoParaArquivoTeste() + ".png";
       // Screenshot.tirarPrintdaTela(driverNagator,arquivoEvidenciaHomePage2);

        return new ElementosBuscaPage(driverNagator);
    }


}
