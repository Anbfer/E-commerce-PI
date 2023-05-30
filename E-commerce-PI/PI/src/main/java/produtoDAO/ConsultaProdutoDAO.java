/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtoDAO;

import classeProduto.Produto;
import clienteDAO.ConsultaClienteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angelo
 */
public class ConsultaProdutoDAO {

    public static void pesquisar(JTable tabela) {

        ArrayList<Produto> lista = ConsultaProdutoDAO.listarProduto();

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        //Percorrer a lista e adicionar a tabela
        for (Produto produto : lista) {

            modelo.addRow(new String[]{String.valueOf(produto.getId()), produto.getNomeProduto(), produto.getDescricao(), produto.getCategoria(), String.valueOf(produto.getQuantidade()), String.valueOf(produto.getValorProduto())});
        }

    }

    public static void pesquisar(JTable tabela, String nome) {

        ArrayList<Produto> lista = ConsultaProdutoDAO.listarProdutoNome(nome);

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        //Percorrer a lista e adicionar a tabela
        for (Produto produto : lista) {
            modelo.addRow(new String[]{String.valueOf(produto.getId()), produto.getNomeProduto(), produto.getDescricao(), produto.getCategoria(), produto.getQuantidade(), produto.getValorProduto()});
        }
    }

    /**
     *
     * @param tabela
     * @param cat
     */
    public static void pesquisarCat(JTable tabela, String cat) {

        ArrayList<Produto> lista = ConsultaProdutoDAO.listarProdutoCategoria(cat);

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        //Percorrer a lista e adicionar a tabela
        for (Produto produto : lista) {
            modelo.addRow(new String[]{String.valueOf(produto.getId()), produto.getNomeProduto(), produto.getDescricao(), produto.getCategoria(), produto.getQuantidade(), produto.getValorProduto()});
        }

    }

    /**
     *
     * @param nome
     * @return listaRetorno
     */
    public static ArrayList<Produto> listarProdutoNome(String nome) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javamarketbd";

            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, "root", "admin");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("SELECT * FROM produto WHERE nomeProd LIKE ?");

            comandoSQL.setString(1, "%" + nome + "%");

            //Passo 4 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorro o resultset ("tabela" na memória)
                //e passo os valores a um objeto
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id_produto"));
                    produto.setNomeProduto(rs.getString("nomeProd"));
                    produto.setDescricao(rs.getString("descProd"));
                    produto.setCategoria(rs.getString("catProd"));
                    produto.setQuantidade(rs.getString("qtdProd"));
                    produto.setValorProduto(rs.getString("valProd"));

                    listaRetorno.add(produto);

                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao" + ex.getMessage());
        }

        return listaRetorno;

    }

    public static ArrayList<Produto> listarProdutoCategoria(String cat) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javamarketbd";

            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, "root", "admin");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("SELECT * FROM produto WHERE catProd LIKE ?");

            comandoSQL.setString(1, "%" + cat + "%");

            //Passo 4 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorro o resultset ("tabela" na memória)
                //e passo os valores a um objeto
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id_produto"));
                    produto.setNomeProduto(rs.getString("nomeProd"));
                    produto.setDescricao(rs.getString("descProd"));
                    produto.setCategoria(rs.getString("catProd"));
                    produto.setQuantidade(rs.getString("qtdProd"));
                    produto.setValidade(rs.getString("validadeProd"));
                    produto.setValorProduto(rs.getString("valProd"));

                    listaRetorno.add(produto);

                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao" + ex.getMessage());
        }

        return listaRetorno;

    }

    public static ArrayList<Produto> listarProduto() {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javamarketbd";

            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, "root", "admin");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("SELECT * FROM produto");

            //Passo 4 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorro o resultset ("tabela" na memória)
                //e passo os valores a um objeto
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id_produto"));
                    produto.setNomeProduto(rs.getString("nomeProd"));
                    produto.setDescricao(rs.getString("descProd"));
                    produto.setCategoria(rs.getString("catProd"));
                    produto.setQuantidade(rs.getString("qtdProd"));
                    produto.setValidade(rs.getString("validadeProd"));
                    produto.setValorProduto(rs.getString("valProd"));

                    listaRetorno.add(produto);

                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao" + ex.getMessage());
        }

        return listaRetorno;

    }//Fim do método listar

    /**
     *
     * @param produto
     * @return
     */
    public static boolean alterarProduto(Produto produto) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            //Carregar Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javamarketbd";

            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, "root", "admin");

            //Passo 3 - Prepara o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE produto SET nomeProd = ?, descProd = ?, catProd = ?, validadeProd = ?, qtdProd = ?, valProd = ? where id_produto = ?");

            comandoSQL.setString(1, produto.getNomeProduto());
            comandoSQL.setString(2, produto.getDescricao());
            comandoSQL.setString(3, produto.getCategoria());
            comandoSQL.setString(4, produto.getValidade());
            comandoSQL.setString(5, produto.getQuantidade());
            comandoSQL.setString(6, produto.getValorProduto());
            comandoSQL.setInt(7, produto.getId());

            //Passo 4 - Executar comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao" + ex.getMessage());
        }

        return retorno;

    }//Fim metodo alterar
    
    public static void excluir(JTable tabela){
        int linhaEscolhida = tabela.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        //remove do banco
        int id = Integer.parseInt(tabela.getValueAt(linhaEscolhida, 0).toString());

        boolean retorno = ConsultaProdutoDAO.excluirProduto(id);
        if (retorno) {
            //Remove da tabela
            modelo.removeRow(linhaEscolhida);
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao excluir registro!");
        }
    }
    
    public static boolean excluirProduto(int id) {

        boolean retorno = false;
        Connection conexao = null;

        try {
            //Passo 1 - Carregaro o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javamarketbd";

            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, "root", "admin");

            //Passo 3 - Prepara o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("DELETE FROM produto WHERE id_produto = ? ");

            comandoSQL.setInt(1, id);

            //Passo 4 - Executar comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexao" + ex.getMessage());
        }

        return retorno;
    }//fim metodo excluir
}
