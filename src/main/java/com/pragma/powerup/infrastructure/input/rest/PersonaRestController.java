package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.PersonaRequestDto;
import com.pragma.powerup.application.dto.response.PersonaResponseDto;
import com.pragma.powerup.application.handler.IPersonaHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/persona")
@RequiredArgsConstructor
public class PersonaRestController {
    private final IPersonaHandler personaHandler;

    @PostMapping("/guardarpersona")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PersonaRequestDto dto) {
        personaHandler.guardarPersona(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/consultarpersona/{id}")
    public ResponseEntity<PersonaResponseDto> consultar(@PathVariable String id) {
        return ResponseEntity.ok(personaHandler.consultarPersona(id));
    }
}
