package com.trimix.backend.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;

import com.trimix.backend.dto.PersonaDto;
import com.trimix.backend.entity.Persona;
import com.trimix.backend.entity.TipoDocumento;
import com.trimix.backend.repository.RepositorioPersona;
import com.trimix.backend.service.ServicioPersona;
@Service
public class ServicioPersonaImpl implements ServicioPersona {

	@Autowired
	private RepositorioPersona repositorio;
	
	@Override
	public List<Persona> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Persona> findById(Long id) {
		return repositorio.findById(id);
	}

	@Override
	public Persona save(PersonaDto personaDto) {
		Persona persona = new Persona();
		this.actualizar(persona, personaDto);
		persona.setFechaInsercion(new Date());
		return repositorio.save(persona);
	}

	@Override
	public void delete(Long id) {
		repositorio.deleteById(id);
	}

	@Override
	public void update(PersonaDto personaDto) {
		Persona persona = repositorio.findById((long)personaDto.getId()).get();
		this.actualizar(persona, personaDto);
		repositorio.save(persona);
	}
	
	private void actualizar(Persona persona, PersonaDto personaDto) {
		persona.setNombre(personaDto.getNombre());
		persona.setApellido(personaDto.getApellido());
		persona.setFechaNacimiento(personaDto.getFechaNacimiento());
		persona.setNumeroDocumento(personaDto.getNumeroDocumento());
		persona.setTipoDocumento(new TipoDocumento(personaDto.getTipoDocumento()));
		persona.setFechaActualizacion(new Date());
	}

	@Override
	public List<Persona> getByName(String nombre) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreCase().withStringMatcher(StringMatcher.CONTAINING);
		Example<Persona> example = Example.of(persona,exampleMatcher);
		return repositorio.findAll(example);
	}
}
