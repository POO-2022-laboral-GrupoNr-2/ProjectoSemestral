package controller;

import connection.ConnectionFactory;
import dao.QuartoJpaController;
import model.Quarto;

/**
 * Esta classe contem metodos que nos permitem estabelecer a conexao entre as
 * camadas model, dao e a view. Metodos relacionados com a entidade.
 *
 *
 * @author
 */
public class QuartoController {

    private static Quarto quarto;
    private static QuartoJpaController controller;

    /**
     * Metodo para cadastrar quartos
     *
     * @param tipo
     * @param preco
     * @param descricao
     * @return true caso nao ocorra nenhuma exception
     */
    public static boolean cadastrar(String tipo, Double preco, String descricao) {

        controller = new QuartoJpaController(ConnectionFactory.getEmf());
        quarto = new Quarto();

        quarto.setTipo(tipo);
        quarto.setPreco(preco);
        quarto.setDescricao(descricao);

        try {
            controller.create(quarto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
    /**
     * Metodo para remover um quarto da base de dados.
     * 
     * @param id identificador do quarto
     * @return 
     */
    public static boolean remover(Long id) {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());

        try {
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
    /**
     * Metodo para alterar os dados dos quartos.
     * 
     * @param id
     * @param tipo
     * @param preco
     * @param descricao
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean actualizar(Long id, String tipo, Double preco, String descricao) {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());

        quarto = controller.findQuarto(id);

        quarto.setTipo(tipo);
        quarto.setPreco(preco);
        quarto.setDescricao(descricao);

        try {
            controller.edit(quarto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    /**
     * Metodo para alterar o status do quarto no momento da checkout ou
     * cancelamento de uma reserva..
     *
     * @param id identificador do quarto
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean statusDisponivel(Long id) {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());
        quarto = controller.findQuarto(id);

        quarto.setEstado("Disponivel");

        try {
            controller.edit(quarto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     * Metodo para alterar o status do quarto no momento do checkin.
     *
     * @param id identificador do quarto
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean statusOcupado(Long id) {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());
        quarto = controller.findQuarto(id);

        quarto.setEstado("Ocupado");

        try {
            controller.edit(quarto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     * Metodo para alterar o status do quarto no momento da reserva.
     *
     * @param id identificador do quarto
     * @return true caso nao ocorra nenhuma exception.
     */
    public static boolean statusReservado(Long id) {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());
        quarto = controller.findQuarto(id);

        quarto.setEstado("Reservado");

        try {
            controller.edit(quarto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     * Metodo para efectuar o calculo do valor de adiantamento no momento de uma
     * reserva.
     *
     * @param id identificador do quartp
     * @return valor que o cliente deve pagar adiantado, correspondente a metade
     * do valor do quarto.
     */
    public static double setarValor(Long id) {
        controller = new QuartoJpaController(ConnectionFactory.getEmf());
        quarto = controller.findQuarto(id);

        return quarto.getPreco() / 2;

    }

}
