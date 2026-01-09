package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPersonaServicePort;
import com.pragma.powerup.domain.model.PersonaModel;
import com.pragma.powerup.domain.spi.IPersonaPersistencePort;

public class PersonaUseCase implements IPersonaServicePort {
    private final IPersonaPersistencePort personaPersistencePort;

    public PersonaUseCase(IPersonaPersistencePort personaPersistencePort) {
        this.personaPersistencePort = personaPersistencePort;
    }

    @Override
    public void guardarPersona(PersonaModel personaModel) {
        personaPersistencePort.savePersona(personaModel);
    }

    @Override
    public PersonaModel consultarPersona(String identificacion) {
        return personaPersistencePort.getPersona(identificacion);
    }
}