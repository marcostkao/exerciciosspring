package br.com.rd.exerciciospring.models.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_cliente")
    private Long idcliente;

    @Column(name = "dt_venda")
    private String dtvenda;

    @Column(name = "vl_venda")
    private BigDecimal vlvenda;


}
