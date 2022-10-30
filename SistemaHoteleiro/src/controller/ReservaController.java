
package controller;

import connection.ConnectionFactory;
import dao.ReservaJpaController;
import java.time.LocalDate;
import model.Reserva;

public class ReservaController {
    private static ReservaJpaController controller;
    private static Reserva reserva;
    
    public static boolean cadastrar(String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi, Double valor){
        controller = new ReservaJpaController(ConnectionFactory.getEmf());
        reserva = new Reserva();

        reserva.setNome(nome);
        reserva.setCelular(celular);
        reserva.setEndereco(endereco);
        reserva.setEmail(email);
        reserva.setGenero(genero);
        reserva.setCheckIn(checkIn);
        reserva.setNacionalidade(nacionalidade);
        reserva.setQuarto(quarto);
        reserva.setNrBi(nrBi);
        reserva.setValor(valor);

        try {
            controller.create(reserva);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
    
    public static boolean actualizar(Long id, String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi, Double valor){
        controller = new ReservaJpaController(ConnectionFactory.getEmf());
        reserva = controller.findReserva(id);
        
        reserva.setNome(nome);
        reserva.setCelular(celular);
        reserva.setEndereco(endereco);
        reserva.setEmail(email);
        reserva.setGenero(genero);
        reserva.setCheckIn(checkIn);
        reserva.setNacionalidade(nacionalidade);
        reserva.setQuarto(quarto);
        reserva.setNrBi(nrBi);
        reserva.setValor(valor);
        
        try {
            controller.edit(reserva);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        
    }

        
    }
    

