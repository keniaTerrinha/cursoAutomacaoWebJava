#language: pt
@tag
Funcionalidade: Formulario Register

  @tag1
  Cenario: Cadastro de Registro
    Dado que estou na pagina register "Register"
    Quando preencho o campo firstName com "Adam"
    E preencho o campo lastName com "Luchini"
    E preencho o campo address com "Rua Mauro"
    E preencho o campo email com "automacaoTurma4@gmail.com"
    E preencho o campo phone com "1145215422"
    E clico em "Male" do campo gender
    E seleciono os hobbies
    	|hobbie|
    	|Movies|
    	|Hockey|
    E seleciono as linguagens
    	|Portuguese|
    	|English|
    E envio o arquivo "teste.jpg"
    E seleciono a skill "Java"
    E seleciono o primeiro country com "Brazil" e o segundo country com "Australia"
    E seleciono o ano "1988" e o mes "October" e o dia "12"
    E preencho o campo password com "Teste123" e o confirma password com "Teste123"
    E clico em cadastrar
    

  