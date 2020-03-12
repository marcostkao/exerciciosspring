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
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long codigo;

    @OneToMany
    @JoinColumn(name = "tb_cupom")
    private Cupom cupom;

    @ManyToOne
    @JoinColumn(name = "tb_produto")
    private Produto produto;

    @Column(name = "qd_produto")
    private Long quantidade;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

}


