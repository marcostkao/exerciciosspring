package br.com.rd.exerciciospring.service;


import br.com.rd.exerciciospring.repositories.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CupomService")
public class CupomService {

        @Autowired
        CupomRepository repository;

}
