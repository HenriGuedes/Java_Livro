# 📚 Java Livro

[![Java Version](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

> Repositório dedicado ao estudo, implementação de códigos, exercícios e projetos baseados no aprendizado de **Java e Orientação a Objetos**.

---

##  Sobre o Projeto
Este projeto foi desenvolvido como parte do estudo prático e consolidação de conceitos fundamentais da linguagem Java. 

A aplicação modela a estrutura de um livro no sistema, controlando seus atributos, estado (como disponibilidade e status de leitura/empréstimo) e fornecendo métodos encapsulados para a manipulação segura desses dados.

###  O que o projeto faz
- **Modelagem da Entidade Livro**: Representa as características do livro (título, autor, número de páginas, status, etc.).
- **Encapsulamento e Controle de Acesso**: Protege o estado interno do objeto utilizando modificadores de acesso (`private`) e expondo métodos de leitura (`getters`) e modificação (`setters`).
- **Validação e Regras de Negócio**: Garante a integridade dos dados ao alterar o status do livro ou manipular seus atributos.
- **Exibição e Formatação**: Formata as informações do livro para exibição clara no console.
---

## 🚀 Conteúdos & Módulos

O projeto está organizado estruturalmente por tópicos e capítulos:

- [x] **Fundamentos do Java**
  - Variáveis, tipos de dados e operadores
  - Estruturas condicionais (`if`, `switch`) e de repetição (`for`, `while`)
- [x] **Orientação a Objetos (POO)**
  - Classes, Objetos, Atributos e Métodos
  - Encapsulamento, Construtores e Modificadores de Acesso
  - Herança, Polimorfismo e Interfaces
- [ ] **Tratamento de Exceções**
  - Bloco `try-catch-finally`
  - Criação de exceções personalizadas
- [ ] **Estrutura de Dados e Collections**
  - `List`, `Set`, `Map`
  - Generics e Comparator/Comparable
- [ ] **Recursos Modernos (Java 8+)**
  - Expressões Lambda e Method References
  - API de Streams e `Optional`
  - Data e Hora (`java.time`)

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17+ (ou versão correspondente)
- **IDE:** IntelliJ IDEA / Eclipse / VS Code
- **Gerenciador de Dependências:** Maven / Gradle *(opcional)*

---

## 🔧 Como Executar o Projeto

### Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:
* [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) versão 17 ou superior.
* Um leitor/IDE de sua preferência ou o terminal/prompt de comando.

### Passo a Passo

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/HenriGuedes/Java_Livro.git
   ```

2. **Acesse a pasta do projeto:**
   ```bash
   cd Java_Livro
   ```

3. **Compile e execute um arquivo `.java` via terminal:**
   ```bash
   # Compilar
   javac src/caminho/do/arquivo/Main.java

   # Executar
   java -cp src caminho.do.arquivo.Main
   ```
   *(Ou abra a pasta diretamente na sua IDE e execute os arquivos com método `main`).*

---



## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<p align="center">
  Desenvolvido por <b>Henri Guedes</b> 🚀
</p>
