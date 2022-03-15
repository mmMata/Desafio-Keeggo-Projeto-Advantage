#language : pt

@login
Funcionalidade: Login

@loginvalido
Esquema do Cenario: Realizar login valido
Dado que eu esteja no site
Quando clico no icone user
E preencho o usuario
E preencho uma senha 
E clico em entrar
Entao realizo o login

@logininvalido
Esquema do Cenario: Realizar login invalido
Dado que eu esteja no site
Quando clico no icone user
E preencho o usuario
E preencho a senha invalida
E clico em entrar
Entao permanesso na tela de login

@logout
Esquema do Cenario: Realizar logout
Dado que eu esteja no site  
Quando clico no icone user
E preencho o usuario
E preencho uma senha
E clico em entrar
E realizo o login
E clico em user apos o login 
E cliclo em Sign Out
Entao realizo o logout