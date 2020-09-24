package com.kaiqueferraz.cursomc.repositories;

import com.kaiqueferraz.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}


//OPERAÇÕES DE ACESSO Á DADOS DE REFERENCIA O OBJETO CATEGORIA