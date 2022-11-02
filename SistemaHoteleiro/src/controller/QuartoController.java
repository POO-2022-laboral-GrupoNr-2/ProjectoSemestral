package controller;

import connection.ConnectionFactory;
import dao.QuartoJpaController;
import model.Quarto;

public class QuartoController {

    private static Quarto quarto;
    private static QuartoJpaController controller;

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
     
      public static boolean statusReservado(Long id) {
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

}
