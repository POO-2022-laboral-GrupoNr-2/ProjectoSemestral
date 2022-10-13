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

@Entity
@Table(name = "Produtos")
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Descrição")
    private String descricao;
    private Integer quantidade;
    @Column(name = "Preço")
    private Double preco;
    private Double custo;
    private LocalDate validade;
    

}
