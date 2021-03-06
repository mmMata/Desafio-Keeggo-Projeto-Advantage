#language : pt

@consulta
Funcionalidade: Consulta

@consultaritem
Esquema do Cenario: Realizar consulta de item
Dado que eu esteja na pagina
Quando clico no icone de user
E preencho o login
E preencho a password
E clico em sign in
E clico na lupa de pesquisa
E digito o nome de um item
E clico na lupa de pesquisa novamente
Entao realizo a consulta do item

@apagarconsulta
Esquema do Cenario: Apagar consulta de item
Dado que eu esteja na pagina
Quando clico no icone de user
E preencho o login
E preencho a password
E clico em sign in
E clico na lupa de pesquisa
E digito o nome de um item
E clico na lupa de pesquisa novamente
Entao apago o nome do item pesquisado

@adicionaritem
Esquema do Cenario: Adicionar item no carrinho
Dado que eu esteja na pagina
Quando clico no icone de user
E preencho o login
E preencho a password
E clico em sign in
E clico na lupa de pesquisa
E digito o nome de um item
E clico na lupa de pesquisa novamente
E clico no produto
E clico em adicionar ao carrinho
E clico no carrinho
Entao valido que o item foi adicionado

@removeritem
Esquema do Cenario: Remover item do carrinho
Dado que eu esteja na pagina
Quando clico no icone de user
E preencho o login
E preencho a password
E clico em sign in
E clico na lupa de pesquisa
E digito o nome de um item
E clico na lupa de pesquisa novamente
E clico no produto
E clico em adicionar ao carrinho
E clico no carrinho
E valido que o item esta no carrinho
E clico em remove
Entao valido que o item foi removido