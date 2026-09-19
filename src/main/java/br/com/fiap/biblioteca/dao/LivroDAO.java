package br.com.fiap.biblioteca.dao;

import br.com.fiap.biblioteca.model.Livro;

import java.util.List;

public interface LivroDAO {
    // Create (Salva um livrom novo no banco de dados )
    void salvar (Livro livro);

    // read (buscar um livro expecifico pelo id cadastrado no banco de dados)
    Livro buscarPorID(int id);

    // read (trazer todos os livros cadastrados)

    List<Livro> listarTodosOsLivros();

    // update (Atualizar as informações de um livro que ja existe)
    void aturalizarLivro(Livro livro);

    // delete (Remover um livro pelo seu ID)



}
