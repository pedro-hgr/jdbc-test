Olá, esse texto é para indicar o processo de conexão jdbc na IDE eclipse e conectar com POSTGRESQL,
 usando o pgadmin 4 como interface de criação de databases!
 
 1: Criar um projeto em java normal.
 
 2: Criar uma pasta de biblioteca (libs ou library por exemplo)
 
 3: Ter uma database nomeada a postos!
 
 4: Criar um pacote e posteriormente uma classe, a ultima com o nome Conexão.
 
 5: Em conexão você deve criar um metodo try catch e importar algumas bibliotecas do java para drive manager e sql.
 
 6: Baixar um driver compativel com o postgre, caso use o postgresql, ou mysql se usar mysql.
 
 7: Colocar esse driver na pasta de bibliotecas que você criou.
 
 8: Conectar o driver pelo build path da pasta projeto do java (pasta principal) e aplicar/acionar seu uso.
 
 9: Siga algumas instrunções para montar a conexão!
 	O getConnection utiliza como parametros o endereço do seu server (localhost:xxxx por exemplo) 
 	com o nome do seu server, e os ultimos dois parametros são o nome do seu usuario sql e sua senha!
 	
10: Após tudo isso estar pronto teste seu codigo para ver se a conexão com o servidor funciona. Se der errado,
	tente identificar typos (erros de digitação) ou as importações na classe Conexão.
	
BOA SORTE!