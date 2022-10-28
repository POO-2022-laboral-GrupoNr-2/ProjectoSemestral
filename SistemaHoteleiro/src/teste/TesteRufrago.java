package teste;

import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Funcionario;

public class TesteRufrago {

    public static void main(String[] args) {

        FuncionarioJpaController controller = new FuncionarioJpaController(ConnectionFactory.getEmf());

        Funcionario funcionario = new Funcionario();
        funcionario.setAcesso("Administrador");
        funcionario.setContacto("840191729");
        funcionario.setEmail("augusto@gmail.com");
        funcionario.setEstado("Activo");
        funcionario.setGenero("Masculino");
        funcionario.setMorada("Machava");
        funcionario.setNascimento(LocalDate.of(2001, 07, 13));
        funcionario.setNome("Augusto Chissano");
        funcionario.setNrBi("10010567C");
        funcionario.setSenha("4886");

        controller.create(funcionario);

    }

}
