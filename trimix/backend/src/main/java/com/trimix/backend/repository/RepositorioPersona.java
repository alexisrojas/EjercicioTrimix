package com.trimix.backend.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.trimix.backend.entity.Persona;

public interface RepositorioPersona extends JpaRepository<Persona, Long> {
	Void save(Optional<Persona> persona);
	List<Persona> findAll();
}
