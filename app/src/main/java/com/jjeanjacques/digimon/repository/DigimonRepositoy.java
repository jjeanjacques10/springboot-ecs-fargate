package com.jjeanjacques.digimon.repository;

import com.jjeanjacques.digimon.entity.Digimon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DigimonRepositoy extends JpaRepository<Digimon, Long> {
    List<Digimon> findAll();
}
