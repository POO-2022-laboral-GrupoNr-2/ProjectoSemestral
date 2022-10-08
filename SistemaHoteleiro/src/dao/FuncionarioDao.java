package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Funcionario;



public class FuncionarioDao {
    public static Connection connection; // Conexão com a base de dados
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;
    
    public static void gravarFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario(nome, apelido, nomeUsuario, senha, genero, datadeNascimento, numeroDeBI, contacto, email, morada, nivelDeAcesso, status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            connection = Conexao.getConexao();//Se o método getConexao na classe conexao nao fosse static, instanciariamos um objecto da classe Conexao usando "new"
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getApelido());
            preparedStatement.setString(3, funcionario.getNomeUsuario());
            preparedStatement.setString(4, funcionario.getSenha());
            preparedStatement.setString(5, funcionario.getGenero());
            preparedStatement.setString(6, funcionario.getDatadeNascimento());
            preparedStatement.setString(7, funcionario.getNumeroDeBI());
            preparedStatement.setString(8, funcionario.getContacto());
            preparedStatement.setString(9, funcionario.getEmail());
            preparedStatement.setString(10, funcionario.getMorada());
            preparedStatement.setString(11, funcionario.getNivelDeAcesso());
            preparedStatement.setString(12, funcionario.getStatus());
            preparedStatement.executeUpdate();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static ArrayList<Funcionario> recuperarFuncionario(){
        connection = Conexao.getConexao();
        String sql = "select from * cliente";
        ArrayList<Funcionario> arrayFuncionario = null;
        try{
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Funcionario funcionario1 = new Funcionario();
                funcionario1.setId(resultSet.getInt(1));
                funcionario1.setNome(resultSet.getString(2));
                funcionario1.setApelido(resultSet.getString(3));
                funcionario1.setNomeUsuario(resultSet.getString(4));
                funcionario1.setSenha(resultSet.getString(5));
                funcionario1.setGenero(resultSet.getString(6));
                funcionario1.setNumeroDeBI(resultSet.getString(7));
                funcionario1.setContacto(resultSet.getString(8));
                funcionario1.setEmail(resultSet.getString(9));
                funcionario1.setMorada(resultSet.getString(10));
                funcionario1.setNivelDeAcesso(resultSet.getString(11));
                arrayFuncionario.add(funcionario1);
            }
        }catch (Exception e){
            
        }
        return arrayFuncionario;
    }
    public static void actualizarFuncionario(Funcionario funcionario){
        String sql = "UPDATE funcionario SET nome=?, apelido=?, nomeUsuario=?, senha=?, genero=?, datadeNascimento=?, numeroDeBI=?, contacto=?, email=?, morada=?, nivelDeAcesso=?, status=? WHERE id=?";
        try{
            connection = Conexao.getConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,funcionario.getNome());
            preparedStatement.setString(2,funcionario.getApelido());
            preparedStatement.setString(3,funcionario.getNomeUsuario());
            preparedStatement.setString(4,funcionario.getSenha());
            preparedStatement.setString(5,funcionario.getGenero());
            preparedStatement.setString(6,funcionario.getDatadeNascimento());
            preparedStatement.setString(7,funcionario.getNumeroDeBI());
            preparedStatement.setString(8,funcionario.getContacto());
            preparedStatement.setString(9,funcionario.getEmail());
            preparedStatement.setString(10,funcionario.getMorada());
            preparedStatement.setString(11,funcionario.getNivelDeAcesso());
            preparedStatement.setString(12,funcionario.getStatus());
            preparedStatement.setInt(13,funcionario.getId());
            preparedStatement.executeQuery();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
