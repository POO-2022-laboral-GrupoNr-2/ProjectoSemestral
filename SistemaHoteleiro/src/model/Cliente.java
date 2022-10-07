package model;

import dao.ClienteDao;

public class Cliente extends Pessoa {

    private String nacionalidade, dataCheckout, dataCheckin, tipoQuarto;
    private Double preco;
    private Double consumo = 0.0;
    private Double total = 0.0;
    private Integer id;
    private Integer nrQuarto;

    public Cliente(String nome, String apelido, String genero, String nacionalidade, String datadeNascimento, String numeroDeBI, String contacto, String email, String morada, String tipoQuarto, Double preco, Integer nrQuarto, String dataCheckin, String dataCheckout) {
        super(nome, apelido, genero, datadeNascimento, email, numeroDeBI, contacto, morada);
        this.nacionalidade = nacionalidade;
        this.dataCheckin = dataCheckin;
        this.tipoQuarto = tipoQuarto;
        this.preco = preco;
        this.nrQuarto = nrQuarto;
    }

    public Cliente() {
       
    }

    public void cadastrarCliente(Cliente cliente) {
        ClienteDao.gravarCliente(cliente);

    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    

    public String getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(String dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public String getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(String dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCliente_id() {
        return id;
    }

    public int getNrquarto() {
        return nrQuarto;
    }

    public void setNrquarto(int nrquarto) {
        this.nrQuarto = nrquarto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
