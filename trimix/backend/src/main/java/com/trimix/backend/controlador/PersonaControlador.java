package com.trimix.backend.controlador;

import java.util.List;
import java.util.Optional;

import com.trimix.backend.dto.PersonaDto;
import com.trimix.backend.entity.Persona;

public interface PersonaControlador {
	public List<Persona> getAll();

	public Optional<Persona> getById(Long id);

	public Persona add(PersonaDto personaDto);

	public void delete(Long id);

	public void update(PersonaDto persona);
	
	public List<Persona> findByName(String nombre);

}