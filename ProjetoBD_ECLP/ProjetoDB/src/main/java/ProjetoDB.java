import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ProjetoDB extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoDB frame = new ProjetoDB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProjetoDB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Principal = new JPanel();
		contentPane.add(Principal, BorderLayout.CENTER);
		Principal.setLayout(null);
		
		JTabbedPane Abas = new JTabbedPane(JTabbedPane.TOP);
		Abas.setBounds(0, 0, 345, 239);
		Principal.add(Abas);
		
		JPanel Login = new JPanel();
		Login.setLayout(null);
		Abas.addTab("Login", null, Login, null);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(157, 72, 133, 20);
		Login.add(txtLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(157, 103, 133, 20);
		Login.add(txtSenha);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(111, 75, 46, 14);
		Login.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(111, 106, 46, 14);
		Login.add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(txtSenha.getPassword());

		        if (txtLogin.getText().equals("adm") && senha.equals("123")) {
		            Abas.setEnabledAt(1, true);
		            Abas.setSelectedIndex(1);

		        } else {
		            JOptionPane.showMessageDialog(null, "Dados de Login Incorretos",
		                    "Mensagem", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		btnEntrar.setBounds(154, 148, 89, 23);
		Login.add(btnEntrar);
		
		JPanel Cadastro = new JPanel();
		Abas.addTab("Cadastro", null, Cadastro, null);
		Cadastro.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(51, 34, 173, 20);
		Cadastro.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 78, 173, 20);
		Cadastro.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 107, 199, 93);
		Cadastro.add(textArea);
	}
}
