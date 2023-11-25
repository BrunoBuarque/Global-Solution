import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MedDAO {
	
    private Connection minhaConexao;
    
    public MedicamentoDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }
    
    //Inserir
    public String inserir(Medicamento Medicamento) throws SQLException {

        String sql = "INSERT INTO T_FIAP_Medicamento (id_Medicamento, sexo_Medicamento, idade_Medicamento, peso_Medicamento, altura_Medicamento, fumante_Medicamento, atividadefisica_Medicamento, consumirfrutas_Medicamento, consumirlegumes_Medicamento, dificuldadelocomocao_Medicamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setInt(1, Medicamento.getId());
        stmt.setString(2, Medicamento.getSexo());
        stmt.setInt(3, Medicamento.getIdade());
        stmt.setInt(4, Medicamento.getPeso());
        stmt.setDouble(5, Medicamento.getAltura());
        stmt.setString(6, Medicamento.getFumante());
        stmt.setString(7, Medicamento.getAtividadeFisica());
        stmt.setString(8, Medicamento.getConsumirFrutas());
        stmt.setString(9, Medicamento.getConsumirLegumes());
        stmt.setString(10, Medicamento.getDificuldadeLocomocao());
		stmt.execute();
        stmt.close();

        return "Medicamento cadastrada com sucesso.";
    }
    
    //Deletar
    public String deletar(int id_Medicamento) throws SQLException {

        String sql = "DELETE FROM T_FIAP_Medicamento WHERE id_Medicamento = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setInt(1, id_Medicamento);
		stmt.execute();
        stmt.close();

        return "Medicamento deletada com sucesso.";
    }
    
    //Alterar
    public String alterar(Medicamento Medicamento) throws SQLException {

        String sql = "UPDATE T_FIAP_Medicamento SET sexo_Medicamento = ?, idade_Medicamento = ?, peso_Medicamento = ? , altura_Medicamento = ?, fumante_Medicamento = ?, atividadefisica_Medicamento = ?, consumirfrutas_Medicamento = ?, consumirlegumes_Medicamento = ?, dificuldadelocomocao_Medicamento = ? WHERE id_Medicamento = ?";

        PreparedStatement stmt = minhaConexao.prepareStatement(sql);
        
        stmt.setString(1, Medicamento.getSexo());
        stmt.setInt(2, Medicamento.getIdade());
        stmt.setInt(3, Medicamento.getPeso());
        stmt.setDouble(4, Medicamento.getAltura());
        stmt.setString(5, Medicamento.getFumante());
        stmt.setString(6, Medicamento.getAtividadeFisica());
        stmt.setString(7, Medicamento.getConsumirFrutas());
        stmt.setString(8, Medicamento.getConsumirLegumes());
        stmt.setString(9, Medicamento.getDificuldadeLocomocao());
        stmt.setInt(10, Medicamento.getId());
		stmt.executeUpdate();
        stmt.close();

        return "Medicamento alterada com sucesso.";
    }
    
    //Selecionar
    public List<Medicamento> selecionar() throws SQLException {
    	List<Medicamento> listaMedicamento = new ArrayList<Medicamento>();
    	
    	PreparedStatement stmt = minhaConexao.prepareStatement
    			("SELECT * FROM T_FIAP_Medicamento");
    	
    	ResultSet rs = stmt.executeQuery();
    	
    	while (rs.next()) {
    		Medicamento acs = new Medicamento();
    		acs.setId(rs.getInt(1));
    		acs.setSexo(rs.getString(2));
    		acs.setIdade(rs.getInt(3));
    		acs.setPeso(rs.getInt(4));
    		acs.setAltura(rs.getDouble(5));
    		acs.setFumante(rs.getString(6));
    		acs.setAtividadeFisica(rs.getString(7));
    		acs.setConsumirFrutas(rs.getString(8));
    		acs.setConsumirLegumes(rs.getString(9));
    		acs.setDificuldadeLocomocao(rs.getString(10));
    		listaMedicamento.add(acs);
		}
    	return listaMedicamento;
    }

}
