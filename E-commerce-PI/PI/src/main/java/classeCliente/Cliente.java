/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeCliente;

/**
 * Classe que representa um cliente.
 *
 * Essa classe contém informações sobre um cliente, como nome, gênero, CPF,
 * email, endereço e telefone. Além disso, possui métodos para acessar e
 * modificar essas informações.
 *
 * @author Angelo
 */
public class Cliente {

    private int id;
    private String nome;
    private String genero;
    private String cpf;
    private String email;
    private String endereco;
    private String telefone;

    /**
     * Construtor vazio da classe Cliente.
     *
     * Cria um objeto Cliente sem inicializar seus atributos.
     */
    public Cliente() {
    }

    /**
     * Construtor da classe Cliente.
     *
     * Cria um objeto Cliente com os valores passados como parâmetro.
     *
     * @param id O ID do cliente.
     * @param nome O nome do cliente.
     * @param genero O gênero do cliente.
     * @param cpf O CPF do cliente.
     * @param email O email do cliente.
     * @param endereco O endereço do cliente.
     * @param telefone O telefone do cliente.
     */
    public Cliente(int id, String nome, String genero, String cpf, String email, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * Construtor da classe Cliente.
     *
     * Cria um objeto Cliente com os valores passados como parâmetro. O ID do
     * cliente é inicializado como 0.
     *
     * @param nome O nome do cliente.
     * @param genero O gênero do cliente.
     * @param cpf O CPF do cliente.
     * @param email O email do cliente.
     * @param endereco O endereço do cliente.
     * @param telefone O telefone do cliente.
     */
    public Cliente(String nome, String genero, String cpf, String email, String endereco, String telefone) {
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * Obtém o ID do cliente.
     *
     * @return O ID do cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do cliente.
     *
     * @param id O ID do cliente.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome O nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o gênero do cliente.
     *
     * @return O gênero do cliente.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o gênero do cliente.
     *
     * @param genero O gênero do cliente.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtém o CPF do cliente.
     *
     * @return O CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     *
     * @param cpf O CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o email do cliente.
     *
     * @return O email do cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do cliente.
     *
     * @param email O email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return O endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco O endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o telefone do cliente.
     *
     * @return O telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do cliente.
     *
     * @param telefone O telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
