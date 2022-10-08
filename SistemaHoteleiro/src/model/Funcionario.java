package model;

import dao.FuncionarioDao;



public class Funcionario extends Pessoa {

    private int Id;
    private String nivelDeAcesso;
    private String senha;
    private String nomeUsuario;
    private String status ;

    public Funcionario(String nome, String apelido, String nomeUsuario, String senha, String genero, String datadeNascimento, String numeroDeBI, String contacto, String email, String morada, String nivelDeAcesso, String status) {
        super(nome, apelido, genero, datadeNascimento, email, numeroDeBI, contacto, morada);
        
        this.nivelDeAcesso = nivelDeAcesso;
        this.senha = senha;
        this.email = email;
        this.nomeUsuario = nomeUsuario;
        this.status = "Activo";
    }

    public Funcionario() {
    }
    
    public void salvarFuncionario(Funcionario funcionario){
        FuncionarioDao.gravarFuncionario(funcionario);
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
        return nomeUsuario;
    }

    public void setUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}
