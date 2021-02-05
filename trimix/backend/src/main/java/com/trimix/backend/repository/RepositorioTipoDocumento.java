package com.trimix.backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.trimix.backend.entity.TipoDocumento;

public interface RepositorioTipoDocumento extends JpaRepository<TipoDocumento, Long> {
	List<TipoDocumento> findAll();
}