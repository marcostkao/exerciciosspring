package br.com.rd.exerciciospring.controllers;

import br.com.rd.exerciciospring.models.entity.Cupom;
import br.com.rd.exerciciospring.repositories.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CupomController {

    @Autowired
    private CupomRepository cupomRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/new-cupom")
    public Cupom save(@RequestBody Cupom cupom){
        return cupomRepository.save(cupom);
    }

}

