package br.com.fiap.biblioteca.model;

public class Livro {
    private String tipoDeCapa;
    private String nomeDoLivro;
    private int qntDePaginas;
    private int qntDeCapitulos;

    private int id;

    public Livro() {}

    public Livro(String tipoDeCapa, String nomeDoLivro, int qntDePaginas, int qntDeCapitulos, int id) {
        this.tipoDeCapa = tipoDeCapa;
        this.nomeDoLivro = nomeDoLivro;
        this.qntDePaginas = qntDePaginas;
        this.qntDeCapitulos = qntDeCapitulos;
        this.id = id;

    }

    public String getTipoDeCapa() {
        return tipoDeCapa;
    }

    public void setTipoDeCapa(String tipoDeCapa) {
        this.tipoDeCapa = tipoDeCapa;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public int getQntDePaginas() {
        return qntDePaginas;
    }

    public void setQntDePaginas(int qntDePaginas) {
        this.qntDePaginas = qntDePaginas;
    }

    public int getQntDeCapitulos() {
        return qntDeCapitulos;
    }

    public void setQntDeCapitulos(int qntDeCapitulos) {
        this.qntDeCapitulos = qntDeCapitulos;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livro { id=" + id + ", titulo='" + nomeDoLivro + '\'' + " }";
    }
}
