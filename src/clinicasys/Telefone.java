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
public class Telefone {
   private short ddd;
   private String fone;
   public void cadastrarTelefone(){
      ddd = Short.parseShort(JOptionPane.showInputDialog("Entre com o DDD"));
      fone = JOptionPane.showInputDialog("Entre com o Telefone");
   }
   public String listarTelefone(){
      String dados = "\nDDD: " + ddd
              + "\nTelefone:" + fone;
              return dados;
   }
   
}
