Feature: Pesquisa com o QA
	Como um recrutador
	Quero colher dados da pesquisa
	Para fazer analises mais detalhadas do QA


  Scenario: Preencher pesquisa com dados obrigatorios validos
    Given que eu acesse a pagina da VV Test
    And acesse o menu "Pesquisa - QA"
    When eu preencher todos os campos obrigatorios
    Then deve ser direcionado para uma pagina de sucesso
    
