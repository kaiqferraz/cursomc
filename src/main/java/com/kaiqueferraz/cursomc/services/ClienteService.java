package com.kaiqueferraz.cursomc.services;

import com.kaiqueferraz.cursomc.domain.Cliente;
import com.kaiqueferraz.cursomc.repositories.ClienteRepository;
import com.kaiqueferraz.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	//chamar objeto por id


	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}


	
}
