/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

import javax.swing.JOptionPane;

/**
 *
 * @author Angelo
 */
public class Validadores {
    private String txtId;
    private String txtNome;
    private String txtCpf;
    private String txtEmail;
    private String txtTelefone;

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
        this.txtId = txtId;
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public String getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(String txtCpf) {
        this.txtCpf = txtCpf;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(String txtTelefone) {
        this.txtTelefone = txtTelefone;
    }
    
    public boolean validarId (String txtId){       
        if(!txtId.matches("\\d+")){
            JOptionPane.showMessageDialog(null, "O ID deve ser um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtId.equals("")){
            JOptionPane.showMessageDialog(null, "O ID deve ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validarNome (String txtNome){      
        String regex = "^[a-zA-ZÀ-ÿ ]+$";
        if(!txtNome.matches(regex)){
            JOptionPane.showMessageDialog(null, "O Nome deve conter apenas letras", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtNome.equals("")){
            JOptionPane.showMessageDialog(null, "O Nome deve ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
        
    public boolean validarEmail (String txtEmail){       
        if(!txtEmail.matches("^\\w+[\\w.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            JOptionPane.showMessageDialog(null, "O e-mail é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtEmail.equals("")){
            JOptionPane.showMessageDialog(null, "O e-mail ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validarTelefone (String txtTelefone){
        if(!txtTelefone.matches("^\\(\\d{2}\\)?[-. ]?\\d{5}[-. ]?\\d{4}$")){
            JOptionPane.showMessageDialog(null, "O telefone é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtTelefone.equals("")){
            JOptionPane.showMessageDialog(null, "O telefone ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validarCpf (String txtCpf){
        if(!txtCpf.matches("^\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}$")){
            JOptionPane.showMessageDialog(null, "O CPF é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtCpf.equals("")){
            JOptionPane.showMessageDialog(null, "O CPF ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
