package controller;

import connection.ConnectionFactory;
import dao.ProdutoJpaController;
import java.time.LocalDate;
import model.Produto;

public class ProdutoController {

    private static Produto produto;
    private static ProdutoJpaController controller;

    public static boolean cadastrar(String descricao, Integer quantidade, Double preco, Double custo, LocalDate validade) {
        controller = new ProdutoJpaController(ConnectionFactory.getEmf());
        produto = new Produto();

        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setCusto(custo);
        produto.setValidade(validade);

        try {
            controller.create(produto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean actualizar(Long id, String descricao, Integer quantidade, Double preco, Double custo, LocalDate validade) {
        controller = new ProdutoJpaController(ConnectionFactory.getEmf());
        produto = controller.findProduto(id);

        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setCusto(custo);
        produto.setValidade(validade);

        try {
            controller.edit(produto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean remover(Long id) {
        controller = new ProdutoJpaController(ConnectionFactory.getEmf());

        try {
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
}
