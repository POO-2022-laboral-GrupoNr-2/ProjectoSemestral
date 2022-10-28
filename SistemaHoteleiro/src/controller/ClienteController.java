package controller;

import connection.ConnectionFactory;
import dao.ClienteJpaController;
import java.time.LocalDate;
import model.Cliente;

/**
 * Esta classe contains os methods que nos permitirao manipular os dados das
 * telas referentes aos hospedes
 *
 * @author Augusto Chissano
 */
public class ClienteController {

    private static ClienteJpaController controller;
    private static Cliente cliente;

    public static boolean cadastrarCliente(String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi) {

        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setCelular(celular);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setGenero(genero);
        cliente.setCheckIn(checkIn);
        cliente.setNacionalidade(nacionalidade);
        cliente.setQuarto(quarto);
        cliente.setNrBi(nrBi);

        try {
            controller.create(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
