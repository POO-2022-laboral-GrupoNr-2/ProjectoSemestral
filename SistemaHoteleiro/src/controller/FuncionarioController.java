package controller;

import View.TelaConsultaDeFuncionarios;
import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import java.time.LocalDate;
import model.Funcionario;

/**
 * Esta classe contem metodos que nos permitem estabelecer a conexao entre as
 * camadas model, dao e a view. Metodos relacionados com a entidade.
 *
 *
 * @author
 */
public class FuncionarioController {

    private static FuncionarioJpaController controller;
    private static Funcionario funcionario;

    /**
     * Metodo para efectuar o cadastro dos funcionarios. A seguir a lista dos
     * dados exigidos no momento do cadstro:
     *
     * @param nome
     * @param nomeDeUsuario
     * @param email
     * @param endereco
     * @param senha
     * @param genero
     * @param acesso
     * @param nascimento
     * @param nrBi
     * @param contacto
     * @param nuit
     * @param contactoAlternativo
     * @return true caso nao ocorra nenhuma exception
     */
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

    /**
     * Metodo para demitir um funcionario, alterando o seu status.
     *
     * @param id identificador do funcionario
     * @return true caso nao ocorra nenhuma exception
     */
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

    /**
     * Metodo para readmitir os funcionarios, alterando o seu status.
     *
     * @param id identificador do cliente
     * @return true caso nao ocorra nenhuma exception
     */
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

    /**
     * Metodo para actualizar os dados de um funcionario, chamdo a partir da
     * tela de actualizacao de dados de funcionarios
     *
     * @param id
     * @param nome
     * @param nomeDeUsuario
     * @param email
     * @param endereco
     * @param senha
     * @param genero
     * @param acesso
     * @param nascimento
     * @param nrBi
     * @param contacto
     * @param nuit
     * @param contactoAlternativo
     * @return true caso nao ocorra nehuma exception
     */
    public static boolean actualizarFuncionario(Long id, String nome, String nomeDeUsuario, String email, String endereco, String senha, String genero, String acesso, LocalDate nascimento, String nrBi, String contacto, Integer nuit, String contactoAlternativo) {

        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
//        Primeiro vamos pegar o registro do funcionario pelo id
        funcionario = controller.findFuncionario(id);

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
            controller.edit(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    /**
     * Metdo para alterar senha de um funcionario
     *
     * @param id identificador do funcionario
     * @param senha
     * @return true caso nao ocorra nenhuma exception
     */
    public static boolean alterarSenha(Long id, String senha) {
        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionario = controller.findFuncionario(id);

        funcionario.setSenha(senha);

        try {
            controller.edit(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     * Metodo para recuperar a senha, chamado a partir da tela de login
     *
     * @param id identificador do funcionario
     * @param novaSenha
     * @return true caso nao ocorra nenhuma exception
     */
    public static boolean recuperarSenha(Long id, String novaSenha) {
        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionario = controller.findFuncionario(id);

        funcionario.setSenha(novaSenha);

        try {
            controller.edit(funcionario);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
