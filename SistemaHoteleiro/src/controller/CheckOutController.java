package controller;

import connection.ConnectionFactory;
import dao.CheckOutJpaController;
import java.time.LocalDate;
import model.CheckOut;

/**
 *
 * @author Augusto Chissano
 */
public class CheckOutController {

    private static CheckOutJpaController controller;
    private static CheckOut checkOut;
    /**
     * Metodo para salvar dados durante o checkout, chamado a partir da tela de checkout.
     * 
     * @param nome
     * @param celular
     * @param endereco
     * @param email
     * @param genero
     * @param checkIn
     * @param nacionalidade
     * @param quarto
     * @param nrBi
     * @return true caso o cadastro seja efectuado com sucesso, e false caso ocorra alguma exception.
     */
    public static boolean adicionar(String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi) {
        controller = new CheckOutJpaController(ConnectionFactory.getEmf());
        checkOut = new CheckOut();

        checkOut.setNome(nome);
        checkOut.setCelular(celular);
        checkOut.setEndereco(endereco);
        checkOut.setEmail(email);
        checkOut.setGenero(genero);
        checkOut.setCheckIn(checkIn);
        checkOut.setNacionalidade(nacionalidade);
        checkOut.setQuarto(quarto);
        checkOut.setNrBi(nrBi);
        
        try {
            controller.create(checkOut);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
