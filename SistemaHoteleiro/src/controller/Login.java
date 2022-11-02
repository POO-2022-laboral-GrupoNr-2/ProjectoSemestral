package controller;

import View.TelaLogin;
import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import java.util.List;
import model.Funcionario;
import validacoes.FuncionarioLogado;
import validacoes.FuncionarioLogadoJpaController;

public class Login {

    /**
     *
     */
    private static FuncionarioLogadoJpaController controllerLogado = new FuncionarioLogadoJpaController(ConnectionFactory.getEmf());
    private static FuncionarioLogado logado = new FuncionarioLogado();
    /*
    *
     */

    private static FuncionarioJpaController controller;
    private static List<Funcionario> funcionarios;

    public static boolean logar(String nomeDeUsuario, String senha) {

        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionarios = controller.findFuncionarioEntities();

        for (Funcionario iterador : funcionarios) {
            if (iterador.getNomeDeUsuario().equalsIgnoreCase(nomeDeUsuario) && iterador.getSenha().equalsIgnoreCase(senha)) {
                //
                try {
                    logado.setAcesso(iterador.getAcesso());
                    controllerLogado.create(logado);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //
                return true;
            }
        }

        return false;
    }

}
