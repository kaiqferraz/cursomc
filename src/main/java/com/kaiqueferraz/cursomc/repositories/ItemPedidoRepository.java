package com.kaiqueferraz.cursomc.repositories;

import com.kaiqueferraz.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}


//OPERAÇÕES DE ACESSO Á DADOS DE REFERENCIA O OBJETO CATEGORIA