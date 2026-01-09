package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.PersonaModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.PersonaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPersonaEntityMapper {

    PersonaEntity toEntity(PersonaModel personaModel);

    PersonaModel toModel(PersonaEntity personaEntity);
}