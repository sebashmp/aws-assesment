package com.pragma.powerup.application.dto.response;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class PersonaResponseDto {
    @NotBlank
    private String identificacion;
    @NotBlank
    private String nombre;
    @Email
    private String email;
}