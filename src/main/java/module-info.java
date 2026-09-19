module com.example.java_livro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.oracle.database.jdbc;

    // Exporta apenas os pacotes reais que contêm código Java
    exports br.com.fiap.biblioteca;
    exports br.com.fiap.biblioteca.dao;
    exports connection;
}