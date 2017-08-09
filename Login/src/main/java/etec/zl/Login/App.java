package etec.zl.Login;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;
public class App extends JFrame
{	
	JLabel menu, lblLogin, lblSenha; 
	JTextField txbLogin, txbSenha;
	JButton btnVerificar;
	public App (){
		super("Menu Principal");
		Container tela = getContentPane();
		
		menu = new JLabel ("Menu Principal");
		menu.setBounds(290, 0, 100, 50);
		tela.add(menu);
		
		lblLogin = new JLabel("Login:");
		lblLogin.setBounds(20,35,100,30);
		tela.add(lblLogin);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(20,85,100,30);
		tela.add(lblSenha);
		
		txbLogin = new JTextField();
		txbLogin.setBounds(70,40,600,20);
		tela.add(txbLogin);
		
		txbSenha = new JTextField();
		txbSenha.setBounds(70,90,600,20);
		tela.add(txbSenha);
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(290,120,100,20);
		tela.add(btnVerificar);
		
		tela.setBackground(Color.white);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(700,200);
	}
	
    public static void main( String[] args )
    {
    	new App();
        }
}
