/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validadores;

import javax.swing.JOptionPane;

/**
 * Esta classe contém métodos para validar campos de entrada.
 *
 * @author Angelo
 */
public class Validadores {

    private String txtId;
    private String txtNome;
    private String txtCpf;
    private String txtEmail;
    private String txtTelefone;
    private String txtQtd;
    private String txtValor;

    public String getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(String txtValor) {
        this.txtValor = txtValor;
    }

    public void setTxtQtd(String txtQtd) {
        this.txtQtd = txtQtd;
    }

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

    public String getTxtQtd() {
        return txtQtd;
    }

    /**
     * Valida um ID.
     *
     * @param txtId o ID a ser validado
     * @return true se o ID for válido, false caso contrário
     */
    public boolean validarId(String txtId) {
        if (!txtId.matches("^\\d{1,4}$")) {
            JOptionPane.showMessageDialog(null, "O ID é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtId.equals("")) {
            JOptionPane.showMessageDialog(null, "O ID deve ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida um nome.
     *
     * @param txtNome o nome a ser validado
     * @return true se o nome for válido, false caso contrário
     */
    public boolean validarNome(String txtNome) {
        String regex = "^[a-zA-ZÀ-ÿ ]{1,55}$";
        if (!txtNome.matches(regex)) {
            JOptionPane.showMessageDialog(null, "O Nome é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtNome.equals("")) {
            JOptionPane.showMessageDialog(null, "O Nome deve ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida um e-mail.
     *
     * @param txtEmail o e-mail a ser validado
     * @return true se o e-mail for válido, false caso contrário
     */
    public boolean validarEmail(String txtEmail) {
        if (!txtEmail.matches("^(?=.{1,40}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "O e-mail é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtEmail.equals("")) {
            JOptionPane.showMessageDialog(null, "O e-mail ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida um telefone.
     *
     * @param txtTelefone o telefone a ser validado
     * @return true se o telefone for válido, false caso contrário
     */
    public boolean validarTelefone(String txtTelefone) {
        if (!txtTelefone.matches("^\\(\\d{2}\\)?[-. ]?\\d{5}[-. ]?\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "O telefone é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtTelefone.equals("")) {
            JOptionPane.showMessageDialog(null, "O telefone ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida um CPF.
     *
     * @param txtCpf o CPF a ser validado
     * @return true se o CPF for válido, false caso contrário
     */
    public boolean validarCpf(String txtCpf) {
        if (!txtCpf.matches("^\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}$")) {
            JOptionPane.showMessageDialog(null, "O CPF é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtCpf.equals("")) {
            JOptionPane.showMessageDialog(null, "O CPF ser preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    /**
     * Valida uma quantidade.
     *
     * @param txtQtd a quantidade a ser validada
     * @return true se a quantidade for válida, false caso contrário
     */
    public boolean validarQtd(String txtQtd) {
        if (!txtQtd.matches("^\\d{1,4}$")) {
            JOptionPane.showMessageDialog(null, "A Quantidade é inválida", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtQtd.equals("")) {
            JOptionPane.showMessageDialog(null, "A Quantiade deve ser preenchida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    /**
     * Valida um valor.
     *
     * @param txtValor o valor a ser validado
     * @return true se o valor for válido, false caso contrário
     */
    public boolean validarValor(String txtValor) {
        if (!txtValor.matches("^(?:(?:\\d{1,3}(?:[,. ]\\d{3})*|[1-9]\\d*)(?:[.,]\\d{1,2})?|\\d+(?:[.,]\\d{1,2})?)$")) {
            JOptionPane.showMessageDialog(null, "O Valor é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtValor.equals("")) {
            JOptionPane.showMessageDialog(null, "O Valor deve ser preenchida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

}
