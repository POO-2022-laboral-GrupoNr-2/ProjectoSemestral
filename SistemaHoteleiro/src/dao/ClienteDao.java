
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Cliente;


public class ClienteDao {
    public static Connection connection;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void gravarCliente(Cliente cliente){
        
       String sql = "INSERT INTO cliente(nome, apelido, genero, nacionalidade, datadeNascimento, numeroDeBI, contacto, email, morada,  tipoQuarto, preco, nrQuarto, dataCheckin, dataCheckout) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            connection = Conexao.getConexao();
            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getApelido());
            ps.setString(3, cliente.getGenero());
            ps.setString(4, cliente.getNacionalidade());
            ps.setString(5, cliente.getDatadeNascimento());
            ps.setString(6, cliente.getNumeroDeBI());
            ps.setString(7, cliente.getContacto());
            ps.setString(8, cliente.getEmail());
            ps.setString(9, cliente.getMorada());
            ps.setString(10, cliente.getTipoQuarto());
            ps.setDouble(11, cliente.getPreco());
            ps.setInt(12, cliente.getNrquarto());
            ps.setString(13, cliente.getDataCheckin());
            ps.setString(14, cliente.getDataCheckout());
            ps.executeUpdate();
            connection.close();
            
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
       
        
        
    }
    
}
