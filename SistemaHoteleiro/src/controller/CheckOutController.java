package controller;

import connection.ConnectionFactory;
import dao.CheckOutJpaController;
import java.time.LocalDate;
import model.CheckOut;

public class CheckOutController {

    private static CheckOutJpaController controller;
    private static CheckOut checkOut;

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
