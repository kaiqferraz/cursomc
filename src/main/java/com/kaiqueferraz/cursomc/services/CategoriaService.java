package com.kaiqueferraz.cursomc.services;

import com.kaiqueferraz.cursomc.services.exceptions.DataIntegrityException;
import com.kaiqueferraz.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.kaiqueferraz.cursomc.domain.Categoria;
import com.kaiqueferraz.cursomc.repositories.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	//chamar objeto por id


	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}


	public Categoria insert(Categoria obj) {
		obj.setId((null));
		return repo.save(obj);
	}


	public Categoria update(Categoria obj) {
		find(obj.getId()); // BUSCA O OBJ NO BANCO, CASO NAO EXISTA TEM UMA EXCEPTION
		return repo.save(obj);
	}


	public void delete(Integer id){
		find(id);
		try{
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e){
           throw new DataIntegrityException("Não é possivel excluir uma categoria que possui produtos");
		}

	}

	public List<Categoria> findAll(){
		return repo.findAll();
	}



	
}
