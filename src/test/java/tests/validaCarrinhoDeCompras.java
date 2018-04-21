package tests;

import WebSuporte.webElementAccessNavigator;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.ElementosBuscaPage;
import pages.ElementosEspecificacaoProduto;
import pages.ElementosHomePage;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massaDeDadosProdutos.csv")

public class validaCarrinhoDeCompras {
    private WebDriver driverNavigator;

    @Before
    public void setUp(){
        driverNavigator = webElementAccessNavigator.acessaViaChrome() ;
    }


    @Test
    public void testValidaCarrinhoDeCompras(@Param(name="nome")String nomeMassa,
                                            @Param(name="resultadoNomeBusca")String resultadoNomeBuscaMassa,
                                            @Param(name="selecionaStatuslista")String selecionaStatuslistaMassa,
                                            @Param(name="escolherProduto")String nomeProdutoEscolhidoMassa,
                                            @Param(name="valor")String valorDoProdutoEspeficicacaoMassa) throws InterruptedException
    {

        ElementosEspecificacaoProduto testValidacaoCarrinhoDecompras = new ElementosHomePage(driverNavigator)
                .CampoBuscaProduto(nomeMassa)
                .validaRetornoDeBusca(resultadoNomeBuscaMassa)
                .comboProdutos(selecionaStatuslistaMassa)
                .produtoEscolhido(nomeProdutoEscolhidoMassa);

                //.valorDoProduto(valorDoProdutoEspeficicacaoMassa);


    }

    @After
    public void tearDown(){
        driverNavigator.quit();
    }

}
