package controller;

import model.Cliente;

public class ClienteController {

    public static boolean salvarCliente(String nome, String apelido, String genero, String nacionalidade, String datadeNascimento, String numeroDeBI, String contacto, String email, String morada, String tipoQuarto, Double preco, Integer nrQuarto, String dataCheckin, String dataCheckout) {

        Cliente cliente = new Cliente(nome, apelido, genero, nacionalidade, datadeNascimento, numeroDeBI, contacto, email, morada, tipoQuarto, preco, nrQuarto, dataCheckin, dataCheckout);
        cliente.cadastrarCliente(cliente);
        return true;
    }

    public static boolean actualizarCliente(Integer Id, String nome, String apelido, String genero, String nacionalidade, String datadeNascimento, String numeroDeBI, String contacto, String email, String morada, String tipoQuarto, Double preco, Integer nrQuarto, String dataCheckin, String dataCheckout) {
        Cliente cliente = new Cliente(nome, apelido, genero, nacionalidade, datadeNascimento, numeroDeBI, contacto, email, morada, tipoQuarto, preco, nrQuarto, dataCheckin, dataCheckout);
        cliente.setId(Id);
        cliente.actualizarCliente(cliente);
        return true;
    }
}
