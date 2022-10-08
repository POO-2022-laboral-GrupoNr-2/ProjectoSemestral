package controller;

import model.Funcionario;


public class FuncionarioController {
    
    public static boolean salvarFuncionario(String nome, String apelido, String nomeUsuario, String senha, String genero, String datadeNascimento, String numeroDeBI, String contacto, String email, String morada, String nivelDeAcesso, String status){
        Funcionario funcionario = new Funcionario(nome, apelido, nomeUsuario, senha, genero, datadeNascimento, numeroDeBI, contacto, email, morada, nivelDeAcesso, status);
        funcionario.salvarFuncionario(funcionario);
        return true;
    }
}
