package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.PersonaRequestDto;

public interface IPersonaHandler {
    void guardarPersona(PersonaRequestDto personaRequestDto);

    PersonaResponseDto consultarPersona(String id);
}
