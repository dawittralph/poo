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
public class ClinicaSys {
   
   public static void main(String[] args) {
      int opc=0;
      Paciente paciente = new Paciente();
      Medico medico = new Medico();
      while(opc!=5){
         opc = Integer.parseInt(JOptionPane.showInputDialog(""
              + "Sistema de Clinica Médica"
              + "\n1 - Cadastrar Paciente"
              + "\n2 - Cadastrar Médico"
              + "\n3 - Listar Paciente"
              + "\n4 - Listar Médico"
              + "\n5 - Sair"));
      
      switch(opc){
         case 1:paciente.cadastrarPaciente();
         break;
         case 2:medico.cadastrarMedico();
         break;
         case 3:paciente.listarPaciente();
         break;
         case 4:medico.listarMedico();
         break;
         case 5: JOptionPane.showMessageDialog(null, "Saindo do sistema");
         break;
         default:JOptionPane.showMessageDialog(null, "Seu analfabeto é de 1 a 5");
      }
      
      }
      
   
   }
   
   
}
