package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipolibro")
@Getter
@Setter
public class TipoLibro {

	@Id
	private int idTipoLibro;
	private String nombre;
	private String estado;

}




