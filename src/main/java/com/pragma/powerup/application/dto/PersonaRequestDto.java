package com.pragma.powerup.application.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class PersonaRequestDto {
    @NotBlank
    private String identificacion;
    @NotBlank
    private String nombre;
    @Email
    private String email;
    // Getters y Setters
}