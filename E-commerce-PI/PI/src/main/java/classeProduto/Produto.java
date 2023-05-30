/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeProduto;

import java.sql.Date;

/**
 * Classe que representa um produto.
 *
 * Essa classe possui informações sobre um produto, como nome, quantidade,
 * valor, descrição, categoria e validade.
 *
 * TODO: Incluir Javadoc de autoria
 *
 * @author Angelo
 */
public class Produto {

    private int id;
    private String nomeProduto;
    private String quantidade;
    private String valorProduto;
    private String descricao;
    private String categoria;
    private String validade;

    /**
     * Construtor padrão da classe Produto.
     */
    public Produto() {
    }

    /**
     * Construtor da classe Produto.
     *
     * @param nomeProduto O nome do produto.
     * @param quantidade A quantidade do produto.
     * @param valorProduto O valor do produto.
     * @param descricao A descrição do produto.
     * @param categoria A categoria do produto.
     * @param validade A validade do produto.
     */
    public Produto(String nomeProduto, String quantidade, String valorProduto, String descricao, String categoria, String validade) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
        this.categoria = categoria;
        this.validade = validade;
    }

    /**
     * Construtor da classe Produto.
     *
     * @param id O ID do produto.
     * @param nomeProduto O nome do produto.
     * @param quantidade A quantidade do produto.
     * @param valorProduto O valor do produto.
     * @param descricao A descrição do produto.
     * @param categoria A categoria do produto.
     * @param validade A validade do produto.
     */
    public Produto(int id, String nomeProduto, String quantidade, String valorProduto, String descricao, String categoria, String validade) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
        this.categoria = categoria;
        this.validade = validade;
    }

    /**
     * Construtor da classe Produto.
     *
     * @param id O ID do produto.
     * @param nomeProduto O nome do produto.
     * @param quantidade A quantidade do produto.
     * @param valorProduto O valor do produto.
     * @param descricao A descrição do produto.
     * @param categoria A categoria do produto.
     */
    public Produto(int id, String nomeProduto, String quantidade, String valorProduto, String descricao, String categoria) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     *
     * @param descricao A descrição do produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a validade do produto.
     *
     * @return A validade do produto.
     */
    public String getValidade() {
        return validade;
    }

    /**
     * Define a validade do produto.
     *
     * @param validade A validade do produto.
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }

    /**
     * Obtém a categoria do produto.
     *
     * @return A categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     *
     * @param categoria A categoria do produto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtém o ID do produto.
     *
     * @return O ID do produto.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do produto.
     *
     * @param id O ID do produto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Define o nome do produto.
     *
     * @param nomeProduto O nome do produto.
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * Obtém a quantidade do produto.
     *
     * @return A quantidade do produto.
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade do produto.
     *
     * @param quantidade A quantidade do produto.
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Obtém o valor do produto.
     *
     * @return O valor do produto.
     */
    public String getValorProduto() {
        return valorProduto;
    }

    /**
     * Define o valor do produto.
     *
     * @param valorProduto O valor do produto.
     */
    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

}
