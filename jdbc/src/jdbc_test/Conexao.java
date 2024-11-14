package jdbc_test;

import java.sql.Connection; // importações de processos nativos do java! aqui é para mexer em sql
import java.sql.DriverManager; // aqui é para utilizar o metodo de conexão e os parametros necessários.

public class Conexao { // classe publica para conectar
	public static void main(String[] args) { // metodo void para escrita em console!
		Connection connection =null; // precisa retornar a conexão, mesmo que esteja vazia/nula
		try {
			
			Class.forName("org.postgresql.Driver"); // nome padrão da origem do driver de postgres!
			connection= DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/test1","postgres","postgres"); 
			/* acima temos o metodo getConnection, usando como parametro o endereço de rede/servidor da
			database, depois o usuarioe a senha. Repare que o numero após local host depende do
			numero que você selecionou como PORTA da sua rede local, o nome após a barra identifica
			a database que você vai utilizar ou melhor, abrir/encontrar. O usuario e a senha são tambem
			escolhas do usuario */
			
			if(connection!=null) {
				System.out.println("Connection OK");
			}else {
				System.out.println("Connection Failed");
			}
			
			
		}catch(Exception err){
			System.out.println("Erro de conexão! "+err);
		}
	}
}
