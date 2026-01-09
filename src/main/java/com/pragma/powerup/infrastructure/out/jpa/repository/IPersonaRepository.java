package com.pragma.powerup.infrastructure.out.jpa.repository;

import com.pragma.powerup.infrastructure.out.jpa.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IPersonaRepository extends JpaRepository<PersonaEntity, Long> {
    Optional<PersonaEntity> findByIdentificacion(String identificacion);
}