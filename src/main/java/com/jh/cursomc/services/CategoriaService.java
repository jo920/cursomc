package com.jh.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.cursomc.domain.Categoria;
import com.jh.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // essa annotation é utilizada para instaciar qualquer dependencia pelo Spring
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 
	}
	
}
