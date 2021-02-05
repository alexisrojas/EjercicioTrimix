package com.trimix.backend.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trimix.backend.entity.TipoDocumento;
import com.trimix.backend.service.ServicioTipoDocumento;

@CrossOrigin(origins = "*")
@RestController
public class TipoDocumentoControladorImpl implements TipoDocumentoControlador {
	
	@Autowired
	private ServicioTipoDocumento servicio;

	@RequestMapping(value = "/tiposdocumento", method = RequestMethod.GET, produces = "application/json")
	@Override
	public List<TipoDocumento> getAll() {
		return servicio.findAll();
	}

}
