package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import connection.ConnectionFactory;
import dao.CheckOutJpaController;
import dao.ClienteJpaController;
import dao.QuartoJpaController;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Date;
import model.CheckOut;
import model.Cliente;
import model.Quarto;

/**
 * Esta classe contains os methods que nos permitirao manipular os dados das
 * telas referentes aos hospedes
 *
 * @author Augusto Chissano
 */
public class ClienteController {

    private static ClienteJpaController controller;
    private static Cliente cliente;
    private static CheckOut checkOut;
    private static CheckOutJpaController controllerCheckOut;
    private static Quarto quarto;
    private static QuartoJpaController controllerQuarto;

    public static boolean cadastrarCliente(String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi) {

        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setCelular(celular);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setGenero(genero);
        cliente.setCheckIn(checkIn);
        cliente.setNacionalidade(nacionalidade);
        cliente.setQuarto(quarto);
        cliente.setNrBi(nrBi);

        //mudando o status do quarto
        QuartoController.statusOcupado(quarto);

        try {
            controller.create(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean actualizar(Long id, String nome, String celular, String endereco, String email, String genero, LocalDate checkIn, String nacionalidade, Long quarto, String nrBi) {

        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = controller.findCliente(id);

        cliente.setNome(nome);
        cliente.setCelular(celular);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setGenero(genero);
        cliente.setCheckIn(checkIn);
        cliente.setNacionalidade(nacionalidade);
        cliente.setQuarto(quarto);
        cliente.setNrBi(nrBi);

        try {
            controller.edit(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean adicionarConsumo(Long id, Double consumo) {
        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        cliente = controller.findCliente(id);

        Double adicionar = cliente.getConsumo() + consumo;
        cliente.setConsumo(adicionar);

        try {
            controller.edit(cliente);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean checkOut(Long id, Double valor) {

        controller = new ClienteJpaController(ConnectionFactory.getEmf());
        controllerCheckOut = new CheckOutJpaController(ConnectionFactory.getEmf());
        controllerQuarto = new QuartoJpaController(ConnectionFactory.getEmf());
        checkOut = new CheckOut();
        quarto = new Quarto();

        cliente = controller.findCliente(id);
        quarto = controllerQuarto.findQuarto(cliente.getQuarto());

        quarto.setEstado("Disponivel");
        cliente.setValor(valor);

        checkOut.setNome(cliente.getNome());
        checkOut.setCelular(cliente.getCelular());
        checkOut.setEndereco(cliente.getEndereco());
        checkOut.setEmail(cliente.getEmail());
        checkOut.setGenero(cliente.getGenero());
        checkOut.setCheckIn(cliente.getCheckIn());
        checkOut.setNacionalidade(cliente.getNacionalidade());
        checkOut.setQuarto(cliente.getQuarto());
        checkOut.setNrBi(cliente.getNrBi());
        checkOut.setConsumo(cliente.getConsumo());
        checkOut.setValor(cliente.getValor());
        checkOut.setCheckOut(LocalDate.now());

        ////Gerar o comprovativo no momento do checkout
        gerarComprovovativo(cliente, valor);

        try {
            controllerQuarto.edit(quarto);
            controllerCheckOut.create(checkOut);
            controller.destroy(id);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static void gerarComprovovativo(Cliente cliente, Double valor) {

        String email = "rufragosystem@gmail.com";
        String arquivo = "Comprovativo.pdf";
        Document document = new Document();
        Date date = new Date();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(arquivo));
            document.open();
            Paragraph p1 = new Paragraph("Rufrago Hotels Manager");
            Paragraph p2 = new Paragraph("Maputo-Cidade");
            Paragraph p3 = new Paragraph("Universidade Eduardo Mondlane");
            Paragraph p4 = new Paragraph("Comprovativo");
            Paragraph p6 = new Paragraph(date.toString());
            Paragraph p7 = new Paragraph(" ");
            Paragraph p8 = new Paragraph(" ");
            Paragraph p10 = new Paragraph("          TransN:         " + " " + cliente.getId());
            Paragraph p11 = new Paragraph("          Nome:           " + " " + cliente.getNome());
            Paragraph p12 = new Paragraph("          Quarto:         " + " " + cliente.getQuarto());
            Paragraph p13 = new Paragraph("          Data Check-In:  " + " " + cliente.getCheckIn());
            Paragraph p14 = new Paragraph("          Data Check-Out: " + " " + LocalDate.now());
            Paragraph p15 = new Paragraph("          Consumo:        " + " " + cliente.getConsumo()
            );
            Paragraph p16 = new Paragraph("          Valor Total:    " + " " + cliente.getValor());
            Paragraph p18 = new Paragraph(" ");
            Paragraph p19 = new Paragraph("          Contacto:      " + " " + 01010101010101l);
            Paragraph p20 = new Paragraph("          Email:         " + " " + email);

            p1.setAlignment(1);
            p2.setAlignment(1);
            p3.setAlignment(1);
            p4.setAlignment(1);
            p6.setAlignment(1);
            p7.setAlignment(0);
            p8.setAlignment(0);
            p10.setAlignment(0);
            p11.setAlignment(0);
            p12.setAlignment(0);
            p13.setAlignment(0);
            p14.setAlignment(0);
            p15.setAlignment(0);
            p16.setAlignment(0);

            document.add(p1);
            document.add(p2);
            document.add(p3);
            document.add(p4);
            document.add(p6);
            document.add(p7);
            document.add(p8);
            document.add(p10);
            document.add(p11);
            document.add(p12);
            document.add(p13);
            document.add(p14);
            document.add(p15);
            document.add(p16);
            document.add(p18);
            document.add(p19);
            document.add(p20);

            document.close();
            Desktop.getDesktop().open(new File(arquivo));

        } catch (Exception e) {

            System.out.println("Erro ao tenetar gerar comprovativo em pdf" + e);
        }
    }

}
