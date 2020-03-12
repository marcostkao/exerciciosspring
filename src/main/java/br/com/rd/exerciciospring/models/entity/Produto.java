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
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produto;

    @Column(name="ds_produto", nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tb_cupom_item")
    private Produto produto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;



}


