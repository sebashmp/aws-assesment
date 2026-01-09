package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.PersonaModel;

public interface IPersonaServicePort {
    void guardarPersona(PersonaModel personaModel);
    PersonaModel consultarPersona(String identificacion);
}