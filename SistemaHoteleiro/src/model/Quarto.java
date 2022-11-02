package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

@NamedQueries(
        {
            @NamedQuery(
                    name = "Quarto.findByLikeDescricao",
                    query = "SELECT q FROM Quarto q WHERE q.descricao LIKE :descricao")
        }
)

@Entity
@Table(name = "Quartos")
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class Quarto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    @Column(name = "Preço")
    private Double preco;
    private String descricao;
    private String estado = "Disponivel";

}
