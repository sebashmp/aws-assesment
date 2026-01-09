package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.PersonaRequestDto;
import com.pragma.powerup.application.dto.response.PersonaResponseDto;
import com.pragma.powerup.application.handler.IPersonaHandler;
import com.pragma.powerup.application.mapper.IPersonaRequestMapper;
import com.pragma.powerup.domain.api.IPersonaServicePort;
import com.pragma.powerup.domain.model.PersonaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonaHandler implements IPersonaHandler {
    private final IPersonaServicePort personaServicePort;
    private final IPersonaRequestMapper personaRequestMapper;

    @Override
    public void guardarPersona(PersonaRequestDto personaRequestDto) {
        PersonaModel personaModel = personaRequestMapper.toModel(personaRequestDto);
        personaServicePort.guardarPersona(personaModel);
    }

    @Override
    public PersonaResponseDto consultarPersona(String id) {
        PersonaModel model = personaServicePort.consultarPersona(id);
        return personaRequestMapper.toResponse(model);
    }
}