package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class ConnectionSingleton {
    private static  Connection conexao; // atributo estatico
    private ConnectionSingleton(){
        //construtor privado
    }
    public  static synchronized Connection getConexao(){
        //metodo de acesso para a conexão
        if (conexao == null){
            try {
                // Carrega o driver JDBC do Oracle
                Class.forName("oracle.jdbc.OracleDriver");
                // Dados de Conexão (Ajuste a URL, Usuário e Senha com os seus dados)
                String url ="jdbc:oracle:thin:@oracle...";
                String user = "****";
                String password = "****";
                //abre Conexão direta  com o banco
                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão Singleton estabelecida com sucesso!");

            } catch (ClassNotFoundException e){ // tratando erros possiveis
                System.err.println("Driver JDBC não encontrado!");
                e.printStackTrace();
            } catch (SQLException e){
                System.err.println("Erro ao conectar bo banco de dados !");
                e.printStackTrace();
            }
        }
        return  conexao;

    }
}
