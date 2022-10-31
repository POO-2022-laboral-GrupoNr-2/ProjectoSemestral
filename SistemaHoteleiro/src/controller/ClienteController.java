package controller;

import connection.ConnectionFactory;
import dao.CheckOutJpaController;
import dao.ClienteJpaController;
import dao.QuartoJpaController;
import java.time.LocalDate;
import model.CheckOut;
import model.Cliente;
import model.Quarto;

/**
 * Esta classe contains os methods que nos permitirao manipular os dados das
 * telas referentes aos hospedes
 *
 * @author Augusto Chissano
 */
public class ClienteController {

    private static ClienteJpaController controller;
    private static Cliente cliente;
    private static CheckOut checkOut;
    private static CheckOutJpaController controllerCheckOut;
    private static Quarto quarto;
    private static QuartoJpaController controllerQuarto;

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

    public static boolean actualizar(Long id, String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi) {

        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = controller.findCliente(id);

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
            controller.edit(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean adicionarConsumo(Long id, Double consumo) {
        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = controller.findCliente(id);

//        Double adicionar = cliente.getConsumo() + consumo;
        Double adicionar = cliente.getConsumo() + consumo;
        cliente.setConsumo(adicionar);

        try {
            controller.edit(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean checkOut(Long id, Double valor) {
        
        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        controllerCheckOut = new CheckOutJpaController(ConnectionFactory.getEmf());
        controllerQuarto = new QuartoJpaController(ConnectionFactory.getEmf());
        checkOut = new CheckOut();
        quarto = new Quarto();

        cliente = controller.findCliente(id);
        quarto = controllerQuarto.findQuarto(cliente.getQuarto());
        
        quarto.setEstado("Disponivel");
        cliente.setValor(valor);

        checkOut.setNome(cliente.getNome());
        checkOut.setCelular(cliente.getCelular());
        checkOut.setEndereco(cliente.getEndereco());
        checkOut.setEmail(cliente.getEmail());
        checkOut.setGenero(cliente.getGenero());
        checkOut.setCheckIn(cliente.getCheckIn());
        checkOut.setNacionalidade(cliente.getNacionalidade());
        checkOut.setQuarto(cliente.getQuarto());
        checkOut.setNrBi(cliente.getNrBi());
        checkOut.setConsumo(cliente.getConsumo());
        checkOut.setValor(cliente.getValor());

        try {
            controllerQuarto.edit(quarto);
            controllerCheckOut.create(checkOut);
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
