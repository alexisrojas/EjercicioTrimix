package com.trimix.backend.dto;

import java.io.Serializable;

public class TipoDocumentoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5110723633181489624L;
	private int id;
	private String descripcion;
	public TipoDocumentoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
