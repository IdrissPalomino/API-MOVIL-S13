package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

	@Query("select t from Libro t join TipoLibro tl on t.tipolib=tl.idTipoLibro where tl.nombre = :var_filtro")
	public List<Libro> listaPorTipo(@Param("var_filtro") String filtro);
}
//select x from Editorial x where x.nombre = :var_filtro