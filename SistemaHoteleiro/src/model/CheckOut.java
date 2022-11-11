package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Classe modelo, para os clientes que forem a efectuar o checkout do hotel.
 * 
 *
 * @author
 */
@Entity
@Table(name = "CheckOut")
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class CheckOut implements Serializable {

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
