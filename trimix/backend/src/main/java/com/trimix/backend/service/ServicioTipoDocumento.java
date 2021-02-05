package com.trimix.backend.service;

import java.util.List;

import com.trimix.backend.entity.TipoDocumento;

public interface ServicioTipoDocumento {
	public List<TipoDocumento> findAll();
}
