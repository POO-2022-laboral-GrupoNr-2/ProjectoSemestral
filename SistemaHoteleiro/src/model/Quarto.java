package model;

public class Quarto {

    private String descricao, tipo, status;
    private int numero;
    private double preco;

    public Quarto(String descricao, String tipo, String status, Integer numero, Double preco) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
        this.numero = numero;
        this.preco = preco;
    }
    
    public Quarto(){
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
