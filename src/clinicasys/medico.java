package clinicasys;

import javax.swing.JOptionPane;

/**
 *
 * @author dawittralph
 */
public class medico extends pessoa{
    private String crm;
    private String celular;
    
    public void cadastrarMedico(){
        super.cadastrarPessoa();
        crm = JOptionPane.showInputDialog("Entre com o CRM do médico");
        celular = JOptionPane.showInputDialog("Entre com o celular do médico");
    }
    
    public void listarMedico(){
        JOptionPane.showMessageDialog(null, super.listarPessoa()
                                      + "\nNúmero do CRM " + crm
                                      + "\nCelular " + celular);
    }
}
