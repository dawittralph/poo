/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Endereco {
   private String logradouro;
   private String numero;
   private String complemento;
   private String cep;
   private String bairro;
   private String cidade;
   private String uf;
   public void cadastrarEndereco(){
      logradouro = JOptionPane.showInputDialog("Entre com o Endereço");
      numero = JOptionPane.showInputDialog("Entre com o numero");
      complemento = JOptionPane.showInputDialog("Entre com o Complemento");
      cep = JOptionPane.showInputDialog("Entre com o CEP");
      bairro = JOptionPane.showInputDialog("Entre com o bairro");
      cidade = JOptionPane.showInputDialog("Entre com a cidade");
      uf = JOptionPane.showInputDialog("Entre com o UF");
   }
   public String listarEndereco(){
      String dados = "\nEndereço: " + logradouro
              + "\nNumero: " + numero
              + "\nComplemento: " + complemento
              + "\nCEP: " + cep
              + "\nBairro: " + bairro
              + "\nCidade: " + cidade
              + "\nEstado: " + uf;
       return dados;
   } 
}
