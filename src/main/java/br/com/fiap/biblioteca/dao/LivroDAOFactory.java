package br.com.fiap.biblioteca.dao;

import connection.ConnectionSingleton;
import br.com.fiap.biblioteca.dao.LivroDAO;
import br.com.fiap.biblioteca.dao.LivroDAOImpl;


public class LivroDAOFactory{
    public static LivroDAO criarLivroDAO(){
        return new LivroDAOImpl(ConnectionSingleton.getConexao());
    }
}
