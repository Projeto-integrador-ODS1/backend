package com.projetointegradorODS1.repository;

import com.projetointegradorODS1.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

    public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

    public List<Tema> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}