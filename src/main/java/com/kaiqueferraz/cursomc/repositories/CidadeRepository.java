package com.kaiqueferraz.cursomc.repositories;


import com.kaiqueferraz.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}


//OPERAÇÕES DE ACESSO Á DADOS DE REFERENCIA O OBJETO CATEGORIA