package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDao {

    public static Connection connection;
    public static PreparedStatement ps;
    public static ResultSet rs;

    public static void gravarCliente(Cliente cliente) {

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

    public static ArrayList<Cliente> recuperarCliente() {
        connection = Conexao.getConexao();
        String sql = "select from * cliente";
        ArrayList<Cliente> clientes = null;

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
//nome, apelido, genero, nacionalidade, datadeNascimento, numeroDeBI, contacto, email, morada,  tipoQuarto, preco, nrQuarto, dataCheckin, dataCheckout) 
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt(1));
                cliente.setNome(rs.getString(2));
                cliente.setApelido(rs.getString(2));
                cliente.setGenero(rs.getString(3));
                cliente.setNacionalidade(rs.getString(4));
                cliente.setDatadeNascimento(rs.getString(5));
                cliente.setNumeroDeBI(rs.getString(6));
                cliente.setContacto(rs.getString(7));
                cliente.setEmail(rs.getString(8));
                cliente.setMorada(rs.getString(9));
                cliente.setTipoQuarto(rs.getString(10));
                cliente.setPreco(rs.getDouble(11));
                cliente.setNrquarto(rs.getInt(12));
                cliente.setDataCheckin(rs.getString(13));
                cliente.setDataCheckout(rs.getString(14));
                clientes.add(cliente);
            }

        } catch (Exception e) {

        }

        return clientes;

    }

}
