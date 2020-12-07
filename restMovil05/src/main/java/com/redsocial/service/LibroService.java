package com.redsocial.service;

import java.util.List;
import com.redsocial.entity.Libro;

public interface LibroService {

	public List<Libro> listaLibro();
	public List<Libro> listaLibroxTipo(String tipo);
}
