package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ElementosCarrinhoDeCompras extends BaseUrl {
    public ElementosCarrinhoDeCompras(WebDriver driverNagator) {
        super(driverNagator);
    }

    public ElementosCarrinhoDeCompras tituloPagiona(String tituloPaginaCarrinhoDeCompras) {
        WebElement tituloCarrinhoDeCompras = driverNagator.findElement(By.xpath("//h2[@class='page-title col-xs-7']"));
        tituloCarrinhoDeCompras.getText();
        Assert.assertEquals("Meu carrinho", tituloPaginaCarrinhoDeCompras);
        return this;
    }

    public ElementosCarrinhoDeCompras qtdProdutos(String qtdProdMassa) {
        return this;

    }

    public ElementosCarrinhoDeCompras calculaFrete(String cep, String valorFrete) {

        return this;
    }
}
