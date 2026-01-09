package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.PersonaRequestDto;
import com.pragma.powerup.application.dto.response.PersonaResponseDto;
import com.pragma.powerup.domain.model.PersonaModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPersonaRequestMapper {

    PersonaModel toModel(PersonaRequestDto personaRequestDto);

    PersonaResponseDto toResponse(PersonaModel personaModel);
}