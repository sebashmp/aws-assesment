package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.PersonaModel;

public interface IPersonaPersistencePort {
    void savePersona(PersonaModel personaModel);
    PersonaModel getPersona(String identificacion);
}