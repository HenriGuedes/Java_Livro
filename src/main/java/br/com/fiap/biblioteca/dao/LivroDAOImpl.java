package br.com.fiap.biblioteca.dao;

import br.com.fiap.biblioteca.model.Livro;
import connection.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAO{
    // variavel que guarda a conexão
    private Connection conexao;

    //construtor que recebe a conexao do banco de dados
    public LivroDAOImpl (Connection conexao){
        this.conexao = conexao;
    }

    @Override
    public void salvar(Livro livro) {
        //Comando sql para add os dados
        String sql = "INSERT INTO Livro(ID_Livro, NomeDoLivro, Capa, QuantidadeDePag, QuantidadeDeCap) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)){
            //substitui as ? por dados que vem do Livro
            stmt.setInt(1, livro.getId());
            stmt.setString(2, livro.getNomeDoLivro());
            stmt.setString(3, livro.getTipoDeCapa());
            stmt.setInt(4,livro.getQntDePaginas());
            stmt.setInt(5,livro.getQntDeCapitulos());

            // executa o comando insert no banco de dados
            stmt.executeUpdate();
            System.out.println("Livro salvo com sucesso!");
        } catch (SQLException e){
            System.err.println("Erro ao salvar o livro no banco de dados.");
            e.printStackTrace();
        }

    }

    @Override
    public Livro buscarPorID(int id) {
        //Comando sql para fazer a busca dos dados
        String sql = "SELECT ID_Livro, NomeDoLivro, Capa, QuantidadeDePag, QuantidadeDeCap FROM LIVRO WHERE ID_Livro = ?";
        Livro livro = null;
        try (PreparedStatement stmt = conexao.prepareStatement(sql)){
            //substitui as ? pelo id
            stmt.setInt(1, id);

            //executeQuery é usado para comandos SELECT
           try(ResultSet rs = stmt.executeQuery()){
               // rs.next move para o proximo item da tabela tipo um for
               if(rs.next()){
                   livro = new Livro();

                   // lendo do banco e preenchendo o objeto Java
                   livro.setId(rs.getInt("ID_LIVRO"));
                   livro.setNomeDoLivro(rs.getString("NOMEDOLIVRO"));
                   livro.setTipoDeCapa(rs.getString("CAPA"));
                   livro.setQntDePaginas(rs.getInt("QUANTIDADEDEPAG"));
                   livro.setQntDeCapitulos(rs.getInt("QUANTIDADEDECAP"));
               }
           }catch (SQLException e) {
               System.err.println("Erro ao buscar o livro pelo ID: " + id);
               e.printStackTrace();
           }

            // executa o comando insert no banco de dados
            stmt.executeUpdate();
            System.out.println("Livro salvo com sucesso!");
        } catch (SQLException e){
            System.err.println("Erro ao salvar o livro no banco de dados.");
            e.printStackTrace();
        }
        return livro;// Retorna o livro preenchido ou null se não encontrar

    }

    @Override
    public List<Livro> listarTodosOsLivros() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM Livro"; // Verifique o nome correto da sua tabela

        try (Connection conn = ConnectionSingleton.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("ID_Livro"));
                livro.setNomeDoLivro(rs.getString("NomeDoLivro"));
                // preencha os outros campos...

                // ATENÇÃO: Verifique se essa linha existe!
                livros.add(livro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livros; // Se a lista estiver vazia, nada será impresso no loop da Main
    }

    @Override
    public void aturalizarLivro(Livro livro) {

    }
}
