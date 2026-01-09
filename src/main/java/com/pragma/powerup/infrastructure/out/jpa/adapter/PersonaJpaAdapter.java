package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.PersonaModel;
import com.pragma.powerup.domain.spi.IPersonaPersistencePort;
import com.pragma.powerup.infrastructure.exception.NoDataFoundException;
import com.pragma.powerup.infrastructure.out.jpa.entity.PersonaEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IPersonaEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IPersonaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonaJpaAdapter implements IPersonaPersistencePort {

    private final IPersonaRepository personaRepository;
    private final IPersonaEntityMapper personaEntityMapper;

    @Override
    public void savePersona(PersonaModel personaModel) {
        PersonaEntity personaEntity = personaEntityMapper.toEntity(personaModel);
        personaRepository.save(personaEntity);
    }

    @Override
    public PersonaModel getPersona(String identificacion) {
        PersonaEntity entity = personaRepository.findByIdentificacion(identificacion)
                .orElseThrow(NoDataFoundException::new);
        return personaEntityMapper.toModel(entity);
    }
}