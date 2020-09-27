package com.kaiqueferraz.cursomc.services;

import com.kaiqueferraz.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiqueferraz.cursomc.domain.Categoria;
import com.kaiqueferraz.cursomc.repositories.CategoriaRepository;

import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	//chamar objeto por id


	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}


	public Categoria insert(Categoria obj) {
		obj.setId((null));
		return repo.save(obj);
	}


	
}
