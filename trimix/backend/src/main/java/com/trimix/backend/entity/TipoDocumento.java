package com.trimix.backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.trimix.backend.dto.TipoDocumentoDto;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1443452090298105213L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "descripcion")
	private String descripcion;

	public TipoDocumento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoDocumento(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public TipoDocumento(TipoDocumentoDto tipoDocumentoDto) {
		this.id = tipoDocumentoDto.getId();
		this.descripcion = tipoDocumentoDto.getDescripcion();
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
