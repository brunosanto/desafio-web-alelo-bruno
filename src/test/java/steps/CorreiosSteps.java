package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CorreiosPage;


public class CorreiosSteps {

    CorreiosPage correiosPage = new CorreiosPage();
    String urlCorreios = "https://buscacepinter.correios.com.br/app/endereco/index.php";

    @Dado("que acesse o site dos correios")
    public void que_acesse_o_site_dos_correios() throws InterruptedException {
        correiosPage.acessarSite(urlCorreios);

    }
    @Quando("informar o CEP {string}")
    public void informar_o_cep(String cep) throws InterruptedException {
        correiosPage.digitarCepEndereco(cep);
    }

    @Quando("clicar no botão buscar")
    public void clicarNoBotãoBuscar() throws InterruptedException {
        correiosPage.clickBuscar();
    }

    @Então("deve ser exibir os dados da consulta")
    public void deveSerExibirOsDadosDaConsulta() {
        correiosPage.exibirResultados();
    }

    @Quando("informar um logradouro válido")
    public void informarUmLogradouroVálido() throws InterruptedException {
        correiosPage.digitarCepEndereco("Avenida São João, São Paulo");
    }

    @Então("exibir todos os resultados da consulta")
    public void exibirTodosOsResultadosDaConsulta() throws InterruptedException {
        correiosPage.exibirResultadosTabela();
    }

    @Então("deve ser exibir a mensagem {string}")
    public void deveSerExibirAMensagem(String mensagem) {
        correiosPage.validarMensagemRetorno(mensagem);
    }

    @E("a mensagem {string}")
    public void aMensagem(String mensagem) {
        correiosPage.validarMensagemAlerta(mensagem);
    }
}
