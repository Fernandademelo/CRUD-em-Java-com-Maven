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
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JTextField txtSigla;
	private JTextField txtNome;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Connection conn = null;
    public Statement stmt;
    public ResultSet rs;
	/**
	 * Create the frame.
	 */
	public Principal() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Principal = new JPanel();
		contentPane.add(Principal, BorderLayout.CENTER);
		Principal.setLayout(null);
		
		JTabbedPane Abas = new JTabbedPane(JTabbedPane.TOP);
		Abas.setBounds(0, 0, 424, 365);
		Principal.add(Abas);
		
		
		JPanel Login = new JPanel();
		Abas.addTab("Login", null, Login, null);
		Login.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(159, 119, 133, 20);
		txtLogin.setColumns(10);
		Login.add(txtLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(159, 150, 133, 20);
		Login.add(txtSenha);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(113, 122, 46, 14);
		Login.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(113, 153, 46, 14);
		Login.add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(156, 195, 89, 23);
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
		Login.add(btnEntrar);
		
		JPanel Cadastro = new JPanel();
		
		Abas.addTab("Cadastro", null, Cadastro, null);
		Cadastro.setLayout(null);
        
		txtSigla = new JTextField();
		txtSigla.setBounds(51, 55, 260, 20);
		Cadastro.add(txtSigla);
		txtSigla.setColumns(10);
		
		JTextArea txtDesc = new JTextArea();
		txtDesc.setBounds(51, 167, 260, 93);
		Cadastro.add(txtDesc);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(51, 111, 260, 20);
		Cadastro.add(txtNome);
		
		JLabel lblNewLabel_2 = new JLabel("Sigla");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(51, 30, 46, 14);
		Cadastro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setBounds(51, 86, 46, 14);
		Cadastro.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição");
		lblNewLabel_5.setBounds(51, 142, 46, 14);
		Cadastro.add(lblNewLabel_5);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnInserir.setBounds(51, 281, 89, 23);
		Cadastro.add(btnInserir);
	}
}
