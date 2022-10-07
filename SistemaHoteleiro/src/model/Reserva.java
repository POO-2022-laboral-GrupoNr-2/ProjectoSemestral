package model;

public class Reserva extends Cliente {

    private int antecipacao;

    public Reserva(String nome, String apelido, String genero, String nacionalidade, String datadeNascimento, String numeroDeBI, String contacto, String email, String morada, String tipoQuarto, Double preco, Integer nrQuarto, String dataCheckin, String dataCheckout) {
        super(nome, apelido, genero, nacionalidade, datadeNascimento, numeroDeBI, contacto, email, morada, tipoQuarto, preco, nrQuarto, dataCheckin, dataCheckout);
    }



    public int getAntecipacao() {
        return antecipacao;
    }

    public void setAntecipacao(int antecipacao) {
        this.antecipacao = antecipacao;
    }

}
