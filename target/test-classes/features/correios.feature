#language:pt

  Funcionalidade: Exibir retorno da busca de CEP e logradouro no site dos Correios

    @cenario_cep_unico
    Cenario: Exibir retorno da pesquisa de um CEP
      Dado que acesse o site dos correios
      E informar o CEP "06322010"
      Quando clicar no botão buscar
      Então deve ser exibir os dados da consulta

    @cenario_logradouro
    Cenario: Exibir os retornos da pesquisa de logradouro
      Dado que acesse o site dos correios
      E informar um logradouro válido
      Quando clicar no botão buscar
      Então exibir todos os resultados da consulta

    @cenario_cep_invalido
    Cenario: Exibir retorno da pesquisa de um CEP invalido
      Dado que acesse o site dos correios
      E informar o CEP "0000000"
      Quando clicar no botão buscar
      Então deve ser exibir a mensagem "Não há dados a serem exibidos"
      E a mensagem "Dados não encontrado"
