package controller;

import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import java.util.List;
import model.Funcionario;

public class Login {

    private static FuncionarioJpaController controller;
    private static List<Funcionario> funcionarios;

    public static boolean logar(String nomeDeUsuario, String senha) {
        controller = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionarios = controller.findFuncionarioEntities();
        for (Funcionario iterador : funcionarios) {
            if (iterador.getNomeDeUsuario().equalsIgnoreCase(nomeDeUsuario) && iterador.getSenha().equalsIgnoreCase(senha)) {
                return true;
            }
        }
        return false;
    }
}
