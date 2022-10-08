package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/rufrago";
        String user = "root";
        String password = "";

        try {

            return DriverManager.getConnection(url, user, password);

        } catch (SQLException ex) {

            System.out.println(ex);

        }

        return null;

    }

}
