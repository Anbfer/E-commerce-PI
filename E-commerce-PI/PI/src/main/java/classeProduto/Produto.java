/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeProduto;

/**
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

    public Produto() {
    }

    public Produto(String nomeProduto, String quantidade, String valorProduto, String descricao, String categoria, String validade) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
        this.categoria = categoria;
        this.validade = validade;
    }

    public Produto(int id, String nomeProduto, String quantidade, String valorProduto, String descricao, String categoria, String validade) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
        this.categoria = categoria;
        this.validade = validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

}
