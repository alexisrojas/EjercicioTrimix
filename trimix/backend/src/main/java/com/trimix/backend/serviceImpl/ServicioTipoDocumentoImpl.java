package com.trimix.backend.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trimix.backend.entity.TipoDocumento;
import com.trimix.backend.repository.RepositorioTipoDocumento;
import com.trimix.backend.service.ServicioTipoDocumento;

@Service
public class ServicioTipoDocumentoImpl implements ServicioTipoDocumento {
	@Autowired
	private RepositorioTipoDocumento repositorio;
	
	@Override
	public List<TipoDocumento> findAll() {
		return repositorio.findAll();
	}

}
