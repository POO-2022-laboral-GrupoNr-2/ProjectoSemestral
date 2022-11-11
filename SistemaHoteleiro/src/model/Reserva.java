package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

/**
 * Classe modelo para os clientes que forem a efectuar uma reserva.
 *
 * @author
 */
@NamedQueries(
        {
            @NamedQuery(
                    name = "Reserva.findByLikeNome",
                    query = "SELECT r FROM Reserva r WHERE r.nome LIKE :nome")
        }
)

@Entity
@Table(name = "Reservas")
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String celular;
    @Column(name = "NrBI")
    private String nrBi;
    private String nacionalidade;
    private String email;
    private String genero;
    @Column(name = "Endereço")
    private String endereco;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Long quarto;
    private Double consumo;
    private Double valor;

}
