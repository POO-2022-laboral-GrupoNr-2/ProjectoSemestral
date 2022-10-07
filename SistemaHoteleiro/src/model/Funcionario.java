package model;



public class Funcionario extends Pessoa {

    private int Codigo;
    private String nivelDeAcesso;
    private String senha;
    private String email;
    private String usuario;
  
    private String status = "Activo";

    public Funcionario(String nome, String apelido, String genero, String datadeNascimento, String email, String numeroDeBI, String contacto, String morada) {
        super(nome, apelido, genero, datadeNascimento, email, numeroDeBI, contacto, morada);
    }

    

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

}
