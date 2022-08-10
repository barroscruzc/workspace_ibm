import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	/** 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	public static JTextField textUsuario;
	public static JTextField textSenha;
	
	/** 
	 * Launch the application.
	 */
	
	public static void main(String[] arts) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	//Inserir a chamada
	final DadosUsuario data = new DadosUsuario();
	JButton btnEntrar = new JButton("Entrar");
	btnEntrar.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if (data.validaPass() == 1) {
				JOptionPane.showMessageDialog(null,  "Seja bem vindo");
			}
			else {
				JOptionPane.showMessageDialog(null,  "Usuário Inválido");
			}
		}
	});
	btnEntrar.setBounds(144, 157, 89, 23);
	contentPane.add(btnEntrar);
}
}
