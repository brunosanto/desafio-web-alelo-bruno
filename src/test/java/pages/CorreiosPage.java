package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseTestCase;

import java.time.Duration;

public class CorreiosPage extends CorreiosPageElements{

    WebDriverWait wait = new WebDriverWait(BaseTestCase.getDriver(), Duration.ofSeconds(30));


    public CorreiosPage(){
        PageFactory.initElements(BaseTestCase.getDriver(), this);
    }

    public void acessarSite(String url) throws InterruptedException {
        BaseTestCase.getDriver().get(url);
        wait.until(ExpectedConditions.visibilityOf(tituloPagina));
        Thread.sleep(1000);
    }

    public void digitarCepEndereco (String cepEnderec) throws InterruptedException {
        inserirTexto.sendKeys(cepEnderec);
        Thread.sleep(1000);
    }

    public void clickBuscar() throws InterruptedException {
        btnBuscar.click();
        Thread.sleep(1000);
    }

    public void exibirResultados(){
        wait.until(ExpectedConditions.visibilityOf(mensagemResultado));
        wait.until(ExpectedConditions.visibilityOf(tabelaResultados));
        System.out.println(tabelaResultados.getText());
    }

    public void exibirResultadosTabela() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(tabelaResultados));
        wait.until(ExpectedConditions.visibilityOf(btnProximo));
        if(!btnProximo.isDisplayed()){
            System.out.println("Nenhum resultado obtido");
        }else {
            while (btnProximo.isDisplayed()){
                Thread.sleep(1000);
                wait.until(ExpectedConditions.visibilityOfAllElements(tabelaResultados));
                System.out.println(tabelaResultados.getText());
                if(btnProximo.isDisplayed()){
                    btnProximo.click();
                }
            }
        }
    }

    public void validarMensagemRetorno(String mensagem) {
        mensagemResultado.equals(mensagem);
    }

    public void validarMensagemAlerta(String mensagem) {
        mensagemAlerta.equals(mensagem);
    }
}
