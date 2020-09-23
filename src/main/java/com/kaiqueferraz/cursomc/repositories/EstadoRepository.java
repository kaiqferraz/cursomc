package com.kaiqueferraz.cursomc.repositories;

import com.kaiqueferraz.cursomc.domain.Categoria;
import com.kaiqueferraz.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}


//OPERAÇÕES DE ACESSO Á DADOS DE REFERENCIA O OBJETO CATEGORIA