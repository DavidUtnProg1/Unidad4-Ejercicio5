package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class SocioRequestDTO {

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacio")
    private String apellido;

    @NotBlank(message = "Email obligatorio")
    @Email(message = "El formato no es valido")
    private String email;

    @NotBlank(message = "El DNI no puede estar vacio")
    @Pattern(regexp="^\\d{8}$", message = "El DNI debe tener 8 caracteres")
    private String dni;

    @NotBlank(message = "La fecha de nacimiento es obligatoria")
    @Past (message = "La fecha de nacimiento debe ser en el pasado")
    private LocalDate fechaNacimiento;

    @NotBlank(message = "El telefono no puede estar vacio")
    @Pattern(regexp = "^\\+[1-9]\\d{1,14}$", message = "El telefono debe seguir formato internacional")
    private String telefono;
    
}