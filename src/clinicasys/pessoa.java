/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicasys;

import javax.swing.JOptionPane;

/**
 *
 * @author dawittralph
 */
public class pessoa {
    protected String nome;
    protected String dtNasc;
    protected String rg;
    protected String cpf;
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String bairro;
    protected String cidade;
    protected String email;
    protected String telefone;
    protected String uf;
    
    public void cadastrarPessoa(){
        nome = JOptionPane.showInputDialog("Entre com o nome");
        dtNasc = JOptionPane.showInputDialog("Entre com a data de nascimento ");
        logradouro = JOptionPane.showInputDialog("Entre com o logradouro ");
        numero = JOptionPane.showInputDialog("Entre com o numero do logradouro");
        complemento = JOptionPane.showInputDialog("Entre com o complemento do logradouro");
        cep = JOptionPane.showInputDialog("Entre com o CEP do logradouro");
        bairro = JOptionPane.showInputDialog("Entre com o bairro do logradouro");
        cidade = JOptionPane.showInputDialog("Entre com a cidade do logradouro");
        email = JOptionPane.showInputDialog("Entre com o e-mail ");
        telefone = JOptionPane.showInputDialog("Entre com o telefone ");
        rg = JOptionPane.showInputDialog("Entre com o número do RG");
        cpf = JOptionPane.showInputDialog("Entre com o número do CPF");        
        while (cpf.length()!=11) {
            JOptionPane.showMessageDialog(null, "O CPF informado é inválido");
            cpf = JOptionPane.showInputDialog("Entre com o número do CPF");            
        }
    }
    
    public String listarPessoa(){
        String dados = "Nome " + nome
                     + "\nData de Nascimento " + dtNasc
                     + "\nLogradouro " + logradouro
                     + "\nNumero " + numero
                     + "\nComplemento " + complemento
                     + "\nCEP " + cep
                     + "\nBairro " + bairro
                     + "\nCidade " + cidade
                     + "\nUF " + uf
                     + "\nRG " + rg
                     + "\nCPF " + cpf
                     + "\nE-mail " + email
                     + "\nTelefone " + telefone;
        return dados;
    }
}
