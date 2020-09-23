package com.kaiqueferraz.cursomc.services;

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
		return obj.orElse(null);
		}

		//se objeto for encontrado, ele é instanciado e retorna obj
	    //se nao retorna nulo

	
}
