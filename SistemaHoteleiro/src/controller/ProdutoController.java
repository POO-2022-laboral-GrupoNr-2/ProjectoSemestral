package controller;

import connection.ConnectionFactory;
import dao.ProdutoJpaController;
import java.time.LocalDate;
import model.Produto;

/**
 * Esta classe contem metodos que nos permitem estabelecer a conexao entre as
 * camadas model, dao e a view. Metodos relacionados com a entidade.
 *
 *
 * @author
 */
public class ProdutoController {

    private static Produto produto;
    private static ProdutoJpaController controller;

    /**
     * Metodo para efectuar o cadastro dos produtos.
     *
     * @param descricao
     * @param quantidade
     * @param preco
     * @param custo
     * @param validade
     * @return true caso nao ocorra nenhuma exception
     */
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

    /**
     * Metodo para alterar os dados de um produto.
     *
     * @param id identificador do produto
     * @param descricao
     * @param quantidade
     * @param preco
     * @param custo
     * @param validade
     * @return true caso nao ocorra nenhuma exception
     */
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

    /**
     * Metodo para remover um produto da base de dados.
     *
     * @param id identificar do produto
     * @return true caso nao ocorra nenhuma exception
     */
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

    /**
     * Metodo para diminuir a quantidade do produto no momento de adicao de
     * consumo para um cliente
     *
     * @param id identificador do produto
     * @param quantidade quantidade a ser retirada
     */
    public static void diminuirQuantidade(Long id, Integer quantidade) {
        controller = new ProdutoJpaController(ConnectionFactory.getEmf());
        produto = controller.findProduto(id);

        Integer sacar = produto.getQuantidade() - quantidade;
        produto.setQuantidade(sacar);
        try {
            controller.edit(produto);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Metodo para calcular o valor total de um consumo baseado na quantidade e
     * preco do produto
     *
     * @param id identificador do produto
     * @param quantidade quantidade requisitada
     * @return
     */
    public static Double calcularPreco(Long id, Integer quantidade) {
        controller = new ProdutoJpaController(ConnectionFactory.getEmf());
        produto = controller.findProduto(id);
        diminuirQuantidade(id, quantidade);

        return produto.getPreco() * quantidade;
    }
}
