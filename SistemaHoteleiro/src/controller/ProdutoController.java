package controller;

import model.Produto;


public class ProdutoController {
    public static boolean salvarProduto(Integer quantidade, Double preco, Double precoCusto, String descricao, String validade) {

        Produto produto = new Produto(quantidade, preco, precoCusto, descricao, validade);
         produto.cadastrarProduto(produto);
        return true;
    }
    
    public static boolean actualizarProduto(Integer id,Integer quantidade, Double preco, Double precoCusto, String descricao, String validade) {

        Produto produto = new Produto(quantidade, preco, precoCusto, descricao, validade);
        produto.setId(id);
        produto.actualizarProduto(produto);
        return true;
    }
}
