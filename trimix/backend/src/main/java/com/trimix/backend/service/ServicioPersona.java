package com.trimix.backend.service;

import java.util.List;
import java.util.Optional;

import com.trimix.backend.dto.PersonaDto;
import com.trimix.backend.entity.Persona;


public interface ServicioPersona {
	public List<Persona> findAll();

	public Optional<Persona> findById(Long id);

	public Persona save(PersonaDto personaDto);

	public void delete(Long id);

	public void update(PersonaDto persona);
	
	public List<Persona> getByName(String nombre);
}