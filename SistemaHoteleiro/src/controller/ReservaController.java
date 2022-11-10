package controller;

import connection.ConnectionFactory;
import dao.ClienteJpaController;
import dao.ReservaJpaController;
import java.time.LocalDate;
import model.Cliente;
import model.Reserva;

/**
 * Esta classe contem metodos que nos permitem estabelecer a conexao entre as
 * camadas model, dao e a view. Metodos relacionados com a entidade.
 *
 *
 * @author
 */
public class ReservaController {

    private static ReservaJpaController controller;
    private static Reserva reserva;
    private static Cliente cliente; //para confirmar uma reserva, eviando para a tabela de clientes.
    private static ClienteJpaController controllerCliente;

    /**
     * Metodo para efectuar o cadastro das reservas, chamado a partir da tela de
     * reservas.
     *
     * @param nome
     * @param celular
     * @param endereco
     * @param email
     * @param genero
     * @param checkIn
     * @param nacionalidade
     * @param quarto
     * @param nrBi
     * @param valor
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean cadastrar(String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi, Double valor) {
        controller = new ReservaJpaController(ConnectionFactory.getEmf());
        reserva = new Reserva();

        reserva.setNome(nome);
        reserva.setCelular(celular);
        reserva.setEndereco(endereco);
        reserva.setEmail(email);
        reserva.setGenero(genero);
        reserva.setCheckIn(checkIn);
        reserva.setNacionalidade(nacionalidade);
        reserva.setQuarto(quarto);
        reserva.setNrBi(nrBi);
        reserva.setValor(valor);

        //mudando o status do quarto
        QuartoController.statusReservado(quarto);

        try {
            controller.create(reserva);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    /**
     * Metodo para actualizar os dados de uma reserva, chamado a partir da tela
     * de actualizacao de dados de uma reserva.
     *
     * @param id
     * @param nome
     * @param celular
     * @param endereco
     * @param email
     * @param genero
     * @param checkIn
     * @param nacionalidade
     * @param quarto
     * @param nrBi
     * @param valor
     * @return true caso nao ocorra nenhuma exception
     */
    public static boolean actualizar(Long id, String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi, Double valor) {
        controller = new ReservaJpaController(ConnectionFactory.getEmf());
        reserva = controller.findReserva(id);

        reserva.setNome(nome);
        reserva.setCelular(celular);
        reserva.setEndereco(endereco);
        reserva.setEmail(email);
        reserva.setGenero(genero);
        reserva.setCheckIn(checkIn);
        reserva.setNacionalidade(nacionalidade);
        reserva.setQuarto(quarto);
        reserva.setNrBi(nrBi);
        reserva.setValor(valor);

        try {
            controller.edit(reserva);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    /**
     * Metodo para cancelar uma reserva.
     *
     * @param id identificador da reserva a ser cancelada
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean cancelar(Long id) {

        controller = new ReservaJpaController(ConnectionFactory.getEmf());
        reserva = controller.findReserva(id);

        try {
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
    /**
     * Metodo para efectuar a confirmacao de uma reserva.
     * 
     * @param id identificar da reserva.
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean confirmar(Long id) {
        controller = new ReservaJpaController(ConnectionFactory.getEmf());
        controllerCliente = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = new Cliente();

        reserva = controller.findReserva(id);

        cliente.setNome(reserva.getNome());
        cliente.setCelular(reserva.getCelular());
        cliente.setEndereco(reserva.getEndereco());
        cliente.setEmail(reserva.getEmail());
        cliente.setGenero(reserva.getGenero());
        cliente.setCheckIn(reserva.getCheckIn());
        cliente.setNacionalidade(reserva.getNacionalidade());
        cliente.setQuarto(reserva.getQuarto());
        cliente.setNrBi(reserva.getNrBi());
        cliente.setValor(reserva.getValor());

        //mudando o status do quarto para ocupado
        QuartoController.statusOcupado(reserva.getQuarto());

        try {
            controllerCliente.create(cliente);
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
