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
@Table(name = "Funcionarios")
@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String contacto;
    private String morada;
    @Column(name = "NrBI")
    private String nrBi;
    private String genero;
    private String acesso;
    private String senha;
    private LocalDate nascimento;
    private String estado;

}
