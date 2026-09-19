package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.dao.LivroDAO;
import br.com.fiap.biblioteca.dao.LivroDAOFactory;
import br.com.fiap.biblioteca.model.Livro;

import java.util.List;

public class Main {
    public static void main(String[] args){

        // Instancia o DAO usando a Factory
        LivroDAO livroDAO = LivroDAOFactory.criarLivroDAO();

        // Criando um livro
        Livro novoLivro = new Livro();
        novoLivro.setId(4);
        novoLivro.setNomeDoLivro("Devorador de Estrelas");
        novoLivro.setTipoDeCapa("Dura");
        novoLivro.setQntDePaginas(250);
        novoLivro.setQntDeCapitulos(7);

        System.out.println("----- Cadastrando Livro --------");
        livroDAO.salvar(novoLivro);

        //Busca por id
        Livro livroBuscado = livroDAO.buscarPorID(1);
        if (livroBuscado != null){
            System.out.println("Encontrado " + livroBuscado.getNomeDoLivro());
        }


        // Listar todos livros cadastrados

        System.out.println("Listando todos os livros cadastrados");

        List<Livro> todos = livroDAO.listarTodosOsLivros();
        for(Livro l : todos){
            System.out.println("ID: " + l.getId() + " Titulo : " + l.getNomeDoLivro());
        }



    }
}
