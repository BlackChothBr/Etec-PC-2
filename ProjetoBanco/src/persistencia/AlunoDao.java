package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.UserSistema;

public class AlunoDao {
	Connection conn;
	
	public AlunoDao(Connection conn){
		this.conn = conn;
	}
	
	public void inserir(UserSistema a) throws Exception{
		String sql = "INSERT INTO alunos (nome) value('"+a.getLogin()+"')";	
		System.out.println(sql);
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.executeUpdate();
	}
	
}
