package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorreiosPageElements {

    @FindBy(id = "titulo_tela")
    protected WebElement tituloPagina;

    @FindBy(id = "endereco")
    protected WebElement inserirTexto;

    @FindBy(id = "btn_pesquisar")
    protected WebElement btnBuscar;

    @FindBy(id = "resultado-DNEC")
    protected WebElement tabelaResultados;

    @FindBy(xpath = "//*[@id='navegacao-resultado']/a[2]")
    protected WebElement btnProximo;

    @FindBy(id = "mensagem-resultado")
    protected WebElement mensagemResultado;

    @FindBy(id = "mensagem-resultado-alerta")
    protected WebElement mensagemAlerta;
}
