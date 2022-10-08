package model;

public class Produto {

    private Integer id, quantidade;
    private Double preco, precoCusto;
    private String descricao, validade;

    public Produto(Integer id, Integer quantidade, Double preco, Double precoCusto, String descricao, String validade) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoCusto = precoCusto;
        this.descricao = descricao;
        this.validade = validade;
    }
    
    

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

}
