package eteczl.atividade_Interface;

import java.util.List;

import javax.swing.JFrame;

//import com.mysql.jdbc.MySQLConnection;

import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.UserSistema;
import persistencia.Conexao;
import view.LoginPanel;
import persistencia.AlunoDao;

public class App 
{
	private static String versao = "v1.0";
	private List<UserSistema> userCadastrados = new ArrayList<UserSistema>();
	private List<UserSistema> userLogados = new ArrayList<UserSistema>();
	private UserSistema usuarioLogado;
	
	public App(){ 
		this.userCadastrados.add(new UserSistema("Administrador","admin","123456"));
		this.showPanelLogin();
	}
	
	public void showPanelLogin(){
		JFrame jFrame = new JFrame("Interface Principal");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jFrame.add(new LoginPanel(this));
		jFrame.pack();
		jFrame.setVisible(true);		
	}
	
	public List<UserSistema> getUsuariosCadastrados(){
		return userCadastrados;
	}
	
	public UserSistema getUsuarioLogado() {
		return usuarioLogado;
	}	
	
	public void setUserLogado(UserSistema userLogado){
		this.userLogados = userLogados;
	}
	public List<UserSistema> getUsuariosLogados() {
		return userLogados;
	}

	public void setUsuariosLogados(List<UserSistema> usuariosLogados) {
		this.userLogados = userLogados;
	}
	
	public static void main(String[] args) throws Exception{
		//new App();
		Connection conn = new Conexao().getMysqlConnection();
		AlunoDao novoAluno = new AlunoDao(conn);
		
		UserSistema a = new UserSistema("Huginho de jesus", "Huginho", "Huginho");
		novoAluno.inserir(a);
	}
}
/*String sql = "insert into alunos (nome) value ('aluno01')";		
ResultSet rs = stm.executeQuery("select * from  Alunos");
PreparedStatement stm = conn.prepareStatement(sql);
stm.executeUpdate();
while(rs.next()){
System.out.println(rs.getString("nome"));
}
		
System.out.println(conn);*/
