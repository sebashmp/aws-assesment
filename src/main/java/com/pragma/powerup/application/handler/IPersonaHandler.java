package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.PersonaRequestDto;
import com.pragma.powerup.application.dto.response.PersonaResponseDto;

public interface IPersonaHandler {
    void guardarPersona(PersonaRequestDto personaRequestDto);

    PersonaResponseDto consultarPersona(String id);
}
