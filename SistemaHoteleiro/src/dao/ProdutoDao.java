package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Produto;



public class ProdutoDao {
    public static Connection connection;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void gravarProduto(Produto produto){
        String sql = "INSERT INTO produto(quantidade, preco, precoCusto, descricao, validade) VALUES (?,?,?,?,?)";
        try{
            connection = Conexao.getConexao();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, produto.getQuantidade());
            ps.setDouble(2, produto.getPreco());
            ps.setDouble(3, produto.getPrecoCusto());
            ps.setString(4, produto.getDescricao());
            ps.setString(5, produto.getValidade());
            ps.executeUpdate();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static ArrayList<Produto> recuperarProduto() {
        connection = Conexao.getConexao();
        String sql = "select from * produto";
        ArrayList<Produto> arrayProduto = null;

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt(1));
                produto.setQuantidade(rs.getInt(2));
                produto.setPreco(rs.getDouble(3));
                produto.setPrecoCusto(rs.getDouble(4));
                produto.setDescricao(rs.getString(5));
                produto.setValidade(rs.getString(6));
                arrayProduto.add(produto);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return arrayProduto;

    }
    
    public static void actualizarCliente(Produto produto){
        String sql = "UPDATE produto SET quantidade=?, preco=?, precoCusto=?, descricao=?, validade=? WHERE id=?";
            
        try{
            connection = Conexao.getConexao();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, produto.getQuantidade());
            ps.setDouble(2, produto.getPreco());
            ps.setDouble(3, produto.getPrecoCusto());
            ps.setString(4, produto.getDescricao());
            ps.setString(5, produto.getValidade());
            ps.setInt(6, produto.getId());
            ps.executeUpdate();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
