package com.jjeanjacques.digimon.controller;

import com.jjeanjacques.digimon.controller.dto.DigimonDTO;
import com.jjeanjacques.digimon.entity.Digimon;
import com.jjeanjacques.digimon.service.DigimonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/digimon")
class DigimonController {

    @Autowired
    DigimonService digimonService;

    @GetMapping
    public ResponseEntity<List<Digimon>> getDigimons() {
        List<Digimon> digimons = digimonService.findAll();
        return ResponseEntity.ok(digimons);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Digimon> getDigimon(@PathVariable Long id) {
        Digimon digimon = digimonService.findById(id);
        return ResponseEntity.ok(digimon);
    }

    @PostMapping
    public ResponseEntity<Digimon> save(@RequestBody DigimonDTO digimonDTO) {
        Digimon digimon = digimonService.create(digimonDTO);
        return ResponseEntity.ok(digimon);
    }
}