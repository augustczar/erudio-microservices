package com.augustczar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augustczar.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}
