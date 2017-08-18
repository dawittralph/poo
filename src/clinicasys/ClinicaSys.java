package clinicasys;

import javax.swing.JOptionPane;

/**
 *
 * @author dawittralph
 */
public class ClinicaSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;
        paciente Paciente = new paciente();
        medico Medico = new medico();
        while (opc!=5) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Sistema de Clínica Médica"
                + "\n1 - Cadastrar Paciente"
                + "\n2 - Cadastrar Médico"
                + "\n3 - Listar Paciente"
                + "\n4 - Listar Médico"
                + "\n5 - Sair"));
            
        switch(opc){
            case 1:Paciente.cadastrarPaciente();
            break;
            case 2:Medico.cadastrarMedico();
            break;
            case 3:Paciente.listarPaciente();
            break;
            case 4:Medico.listarMedico();
            break;
            case 5: JOptionPane.showMessageDialog(null, "Saindo do sistema");
            break;
            default:JOptionPane.showMessageDialog(null, "Seu analfabeto, as opções são de 1 a 5");
        }
        }
    }
    
}
