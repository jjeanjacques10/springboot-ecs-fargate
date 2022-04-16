package com.jjeanjacques.digimon.service;

import com.jjeanjacques.digimon.controller.dto.DigimonDTO;
import com.jjeanjacques.digimon.entity.Digimon;
import com.jjeanjacques.digimon.repository.DigimonRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DigimonService {

    @Autowired
    private DigimonRepositoy digimonRepositoy;

    public List<Digimon> findAll() {
        return digimonRepositoy.findAll();
    }

    public Digimon create(DigimonDTO digimon) {
        Digimon digimonEntity = Digimon.builder()
                .name(digimon.getName())
                .power(digimon.getPower()).build();

        return digimonRepositoy.save(digimonEntity);
    }

    public Digimon findById(Long id) {
        return digimonRepositoy.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Digimon not found"));
    }
}
