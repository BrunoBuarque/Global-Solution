package br.com.fiap.gs.safemed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutenticaDAO {
	
	 private Connection minhaConexao;

	 public AutenticaDAO() throws ClassNotFoundException, SQLException {
	        super();
	        this.minhaConexao = new ConexaoFactory().conexao();
	    }
	
	//Inserir
    public String inserir(Autentica Autentica) throws SQLException {

        String sql = "INSERT INTO T_FIAP_Autentica ( login_Autentica, senha_Autentica ) VALUES (?, ?)";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, Autentica.getlogin());
        stmt.setString(2, Autentica.getSenha());
        stmt.executeUpdate();
        stmt.close();

        return "Autentica feito com sucesso.";
    }
    
    //Deletar
    public String deletar(String login_Autentica) throws SQLException {

        String sql = "DELETE FROM T_FIAP_Autentica WHERE login_Autentica = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, login_Autentica);
        stmt.executeUpdate();
        stmt.close();

        return "Autentica deletado com sucesso.";
    }
    
    //Alterar 
    public String alterar(Autentica Autentica) throws SQLException {

        String sql = "UPDATE T_FIAP_Autentica SET senha_Autentica = ? WHERE login_Autentica = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, Autentica.getlogin());
        stmt.setString(2, Autentica.getSenha());
        stmt.executeUpdate();
        stmt.close();

        return "Autentica alterado com sucesso.";
    }
    
    //Selecionar
    public List<Autentica> selecionar() throws SQLException {
    	List<Autentica> listaAutentica = new ArrayList<Autentica>();
    	
    	PreparedStatement stmt = minhaConexao.prepareStatement
    			("SELECT * FROM T_FIAP_Autentica");
    	
    	ResultSet rs = stmt.executeQuery();
    	
    	while (rs.next()) {
    		Autentica acs = new Autentica();
    		acs.setlogin(rs.getString(1));
    		acs.setSenha(rs.getString(2));
    		listaAutentica.add(acs);
		}
    	return listaAutentica;
    }


}

