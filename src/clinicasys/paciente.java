package clinicasys;

import javax.swing.JOptionPane;

/**
 *
 * @author dawittralph
 */
public class paciente extends pessoa{
    private String convenio;
    
    public void cadastrarPaciente(){
        super.cadastrarPessoa();
        convenio = JOptionPane.showInputDialog("Entre com o convenio do paciente");
    }
    
    public void listarPaciente(){
        JOptionPane.showMessageDialog(null, super.listarPessoa()
                                      + "\nConvenio " + convenio);
    }
}