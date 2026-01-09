package com.pragma.powerup.infrastructure.configuration;

import com.pragma.powerup.domain.api.IPersonaServicePort;
import com.pragma.powerup.domain.spi.IPersonaPersistencePort;
import com.pragma.powerup.domain.usecase.PersonaUseCase;
import com.pragma.powerup.infrastructure.out.jpa.adapter.PersonaJpaAdapter;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IPersonaEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IPersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IPersonaRepository personaRepository;
    private final IPersonaEntityMapper personaEntityMapper;

    @Bean
    public IPersonaPersistencePort personaPersistencePort() {
        return new PersonaJpaAdapter(personaRepository, personaEntityMapper);
    }

    @Bean
    public IPersonaServicePort personaServicePort() {
        return new PersonaUseCase(personaPersistencePort());
    }
}