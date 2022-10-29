package controller;

import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import java.time.LocalDate;
import model.Funcionario;

public class FuncionarioController {

    private static FuncionarioJpaController controller;
    private static Funcionario funcionario;

    public static boolean cadastrarFuncionario(String nome, String nomeDeUsuario, String email, String endereco, String senha, String genero, String acesso, LocalDate nascimento, String nrBi, String contacto, Integer nuit, String contactoAlternativo) {
        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionario = new Funcionario();

        funcionario.setNome(nome);
        funcionario.setNomeDeUsuario(nomeDeUsuario);
        funcionario.setEmail(email);
        funcionario.setEndereco(endereco);
        funcionario.setSenha(senha);
        funcionario.setGenero(genero);
        funcionario.setAcesso(acesso);
        funcionario.setNascimento(nascimento);
        funcionario.setNrBi(nrBi);
        funcionario.setContacto(contacto);
        funcionario.setNuit(nuit);
        funcionario.setContactoAlternativo(contactoAlternativo);

        try {
            controller.create(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean demitirFuncionario(Long id) {
        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionario = controller.findFuncionario(id);
        
        funcionario.setEstado("Inactivo");
        try {
            controller.edit(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean readmitirFuncionario(Long id) {
         controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionario = controller.findFuncionario(id);
        
        funcionario.setEstado("Activo");
        try {
            controller.edit(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }


    }

}
