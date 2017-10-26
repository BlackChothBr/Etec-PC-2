package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import persistencia.ConectionFactory;
import persistencia.UsuarioDAO;

public class Login extends JFrame{
	ConectionFactory conecta = new ConectionFactory();
	
	private JLabel titulo = new JLabel("Tela de Login");	
	private JLabel lblLogin = new JLabel("Login ");
	private JTextField txtLogin = new JTextField("");
	private JLabel lblSenha = new JLabel("Senha ");
	private JPasswordField txtSenha = new JPasswordField();
	private JButton btnEntrar = new JButton("Entrar");
	
	public Login() {
		conecta.conexao();
		this.add(this.titulo);
		this.setSize(350,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		lblLogin.setBounds(150,20,50,25);
		add(lblLogin);
		txtLogin.setBounds(75,45,200,25);
		add(txtLogin);
		
		lblSenha.setBounds(150,70,100,25);
		add(lblSenha);
		txtSenha.setBounds(75,90,200,25);
		add(txtSenha);

		btnEntrar.setBounds(125,145,100,25);
		add(btnEntrar);
		
		this.btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// Fazer a validação do login com o banco de dados e verificar o nivel de acesso
					UsuarioDAO dao = new UsuarioDAO();
					
					try {
						if(dao.checkLogin(txtLogin.getText(), String.valueOf(txtSenha.getPassword()))) {
							dispose();
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Erro ao validar: "+e1);
					}
				// FIM
				
			}
		});
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
}
