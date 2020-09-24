package com.kaiqueferraz.cursomc.repositories;

import com.kaiqueferraz.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}


//OPERAÇÕES DE ACESSO Á DADOS DE REFERENCIA O OBJETO CATEGORIA