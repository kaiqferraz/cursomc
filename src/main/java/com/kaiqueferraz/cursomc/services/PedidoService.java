package com.kaiqueferraz.cursomc.services;

import com.kaiqueferraz.cursomc.domain.Pedido;
import com.kaiqueferraz.cursomc.repositories.PedidoRepository;
import com.kaiqueferraz.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	//chamar objeto por id


	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}


	
}
