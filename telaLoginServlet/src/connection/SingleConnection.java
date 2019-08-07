package connection;

import java.sql.Connection;
import java.sql.DriverManager;

//CONCEXÃO COM O BANCO
public class SingleConnection {
	private static String banco = "jdbc:postgresql://locahost:5432/telaLoginServlet?autoReconnect=true";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco, user, password);
				connection.setAutoCommit(false);
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conctar o Banco de Dados");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
