# language: pt

@LojaVirtual
	Funcionalidade: Loja Virtual
		Busca Livro
		
		@ValidarLivro
		Cenario: Validar Livro
			Dado que estou na pagina loja virtual
			Quando realizo a busca do livro "Fortaleza Digital"
			Entao valido o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital" e o pre�o sendo "R$519,90"
			Quando clico no livro pesquisado
			Entao Confirmo o titulo sendo "[PRODUTO DE EXEMPLO] - Fortaleza Digital" e o pre�o sendo "R$519,90"
