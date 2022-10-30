package teste;

import connection.ConnectionFactory;
import controller.ClienteController;
import dao.ClienteJpaController;
import dao.FuncionarioJpaController;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.Funcionario;

public class TesteRufrago {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCelular("840191729");
        cliente.setEmail("augusto@gmail.com");
        cliente.setGenero("Masculino");
        cliente.setEndereco("Machava");
        cliente.setCheckIn(LocalDate.of(2001, 07, 13));
        cliente.setNome("Augusto Chissano");

        boolean result = ClienteController.cadastrarCliente("ac", "as", "aa", "aa", "a", LocalDate.of(2001, 01, 01), "moz", 12l, "123");
        System.out.println(result);
    }

}
