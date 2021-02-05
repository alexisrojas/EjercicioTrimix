package com.trimix.backend.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trimix.backend.dto.PersonaDto;
import com.trimix.backend.entity.Persona;
import com.trimix.backend.service.ServicioPersona;

@CrossOrigin(origins = "*")
@RestController
public class PersonaControladorImpl implements PersonaControlador {
	
	@Autowired
	private ServicioPersona servicio;
	
	@RequestMapping(value = "/personas", method = RequestMethod.GET, produces = "application/json")
	@Override
	public List<Persona> getAll() {
		return servicio.findAll();
	}
	
	@RequestMapping(value = "/personas/{id}", method = RequestMethod.GET, produces = "application/json")
	@Override
	public Optional<Persona> getById(@PathVariable Long id) {
		return servicio.findById(id);
	}
	
	@RequestMapping(value = "/personas/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@Override
	public Persona add(@RequestBody PersonaDto personaDto) {
		return servicio.save(personaDto);
	}
	@RequestMapping(value = "/personas/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@Override
	public void delete(@PathVariable Long id) {
		servicio.delete(id);
	}
	
	@RequestMapping(value = "/personas/update", method = RequestMethod.PUT, produces = "application/json")
	@Override
	public void update(@RequestBody PersonaDto personaDto) {
		servicio.update(personaDto);
	}

	@RequestMapping(value = "/personas/nombre/{nombre}", method = RequestMethod.GET, produces = "application/json")
	@Override
	public List<Persona> findByName(@PathVariable String nombre) {
		// TODO Auto-generated method stub
		return servicio.getByName(nombre);
	}	
}
