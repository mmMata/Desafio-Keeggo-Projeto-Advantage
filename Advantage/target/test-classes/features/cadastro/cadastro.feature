#language : pt

@cadastro
Funcionalidade: Cadastro

@cadastrovalido
Esquema do Cenario: Realizar cadastro válido
Dado que eu esteja no site Advantage
Quando clico no icone de usuario
E clico em criar nova conta
E preencho o nome de usuario 
E preencho o email 
E preencho a senha  
E confirmo a senha 
E preencho o primeiro nome 
E preencho o segundo nome  
E preencho o numero de telefone
E selecione o pais
E preencho a cidade 
E preencho o endereco
E preencho o estado
E preencho o codigo postal
E clico em concordo com os termos de condicoes
E clico em registrar
Entao sou direcionado para tela inicial da pagina

@cadastroinvalido
Esquema do Cenario: Realizar cadastro inválido
Dado que eu esteja no site Advantage
Quando clico no icone de usuario
E clico em criar nova conta
E preencho o nome de usuario ja existente
E preencho o email 
E preencho a senha  
E confirmo a senha 
E preencho o primeiro nome 
E preencho o segundo nome  
E preencho o numero de telefone
E selecione o pais
E preencho a cidade 
E preencho o endereco
E preencho o estado
E preencho o codigo postal
E clico em concordo com os termos de condicoes
E clico em registrar
Entao permanesso na tela de cadastro

