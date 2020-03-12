package br.com.rd.exerciciospring.repositories;



import br.com.rd.exerciciospring.models.entity.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

    List<Cupom> findByIdCliente(Long idcliente);
    List<Cupom> findByDtVenda(String dtvenda);

}


