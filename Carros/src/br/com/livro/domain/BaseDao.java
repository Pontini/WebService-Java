package br.com.livro.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BaseDao {

	public BaseDao(){
		
		try{
			//Necessário para utilizar jdbc
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch (ClassNotFoundException e){
			//Erro driver JDBC (adicione o drive .jar do mysql em /web-inf/lib)
			e.printStackTrace();
		}
		
	}
	protected Connection getConnection() throws SQLException{
		//url  de conexao com o banco de dados
		
		String url ="jdbc:mysql://localhost/livro?useSSL=false";
		
		//conecta utilizando a url, usuario e senha.
		Connection conn = DriverManager.getConnection(url,"root","f03c2919");
		return conn;
		
		
	}
	
	public static void main (String[] args) throws SQLException{
		
		BaseDao db = new BaseDao();
		
		//Verifica  a conexao
		
		Connection conn = db.getConnection();
		System.out.println("Objeto Banco dados "+conn);
		System.out.println("Banco de dados    "+"   Conectado com Sucesso");

		
	}
	
	
}
