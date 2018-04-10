package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ElementosCarrinhoDeCompras extends BaseUrl {
    public ElementosCarrinhoDeCompras(WebDriver driverNagator) {
        super(driverNagator);
    }

    public ElementosCarrinhoDeCompras tituloPagiona(String tituloPaginaCarrinhoDeCompras){
        WebElement tituloCarrinhoDeCompras = driverNagator.findElement(By.xpath("//h2[@class='page-title col-xs-7']"));
        tituloCarrinhoDeCompras.getText();
        Assert.assertEquals("Meu carrinho",tituloPaginaCarrinhoDeCompras);
        return this;
    }

    public ElementosCarrinhoDeCompras qtdProdutos(String qtdProdMassa){

        WebElement qtdProdutos = driverNagator.findElement(By.xpath("//div[@class='form-control select__quantity']"));
        String valorProduto = driverNagator.findElement(By.xpath("//span[@class='basket-productPrice']")).getText();

        List<String> textoValor = Arrays.asList(Pattern.compile("R$").split(valorProduto));
/*
        String input = "st1:st2:st3";
        System.out.println(Arrays .asList(Pattern.compile(":").split(input)));
        System.out.println(Arrays.asList(Pattern.compile(":").split(input, 2)));

        Aqui, o segundo sysout é um exemplo do método de separação com o argumento limite.
        A saída do trecho acima é [st1, st2, st3][st1, st2:st3]
*/
        String valorUnitarioProduto = valorProduto.s
        new Select(qtdProdutos).selectByVisibleText(qtdProdMassa);



        switch (qtdProdMassa){
            case 1 :
                1 * 1;
                break;
            case 2:
                int qtdProdMassa * 1;
                break;
            case 3:
                int qtdProdMassa * 1;
                break;
            case 4:
                default:

        }

        return this;
    }

    public ElementosCarrinhoDeCompras calculaFrete(String cep , String valorFrete){

        return this;
    }

}
