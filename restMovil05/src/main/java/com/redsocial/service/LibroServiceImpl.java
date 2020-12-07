package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Libro;
import com.redsocial.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repository;

	@Override
	public List<Libro> listaLibro() {
		return repository.findAll();
	}

	@Override
	public List<Libro> listaLibroxTipo(String tipo) {

		return repository.listaPorTipo(tipo);
	}
	
}


