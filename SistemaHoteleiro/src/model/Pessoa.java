package model;

public abstract class Pessoa {

    protected String nome, apelido, genero, datadeNascimento, email, numeroDeBI, contacto, morada;

    public Pessoa(String nome, String apelido, String genero, String datadeNascimento, String email, String numeroDeBI, String contacto, String morada) {
        this.nome = nome;
        this.apelido = apelido;
        this.genero = genero;
        this.datadeNascimento = datadeNascimento;
        this.email = email;
        this.numeroDeBI = numeroDeBI;
        this.contacto = contacto;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDeBI() {
        return numeroDeBI;
    }

    public void setNumeroDeBI(String numeroDeBI) {
        this.numeroDeBI = numeroDeBI;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    
}
