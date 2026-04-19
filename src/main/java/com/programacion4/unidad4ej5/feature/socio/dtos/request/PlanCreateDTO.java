package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

public class PlanCreateDTO {

    @NotNull(message = "El objetiovo del plan no puede estar vacio")
    @Size(min = 10, max = 200, message = "El objetivo del plan debe tener entre 10 y 200 caracteres")
    private String objetivo;
    
    @NotNull(message = "La frecuencia del plan no puede estar vacia")
    @Min(value = 2, message = "La frecuencia del plan debe ser al menos 1 vez por semana")
    @Max(value = 7, message = "La frecuencia del plan no puede ser mayor a 7 veces por semana")
    private Integer frecuencia;

    @NotNull(message = "El Peso inicial del plan no puede estar vacio")
    @DecimalMin(value = "30.0", message = "El peso inicial del plan debe ser mayor a 30.0")
    @DecimalMax(value = "250.0", message = "El peso inicial del plan no puede ser mayor a 250")
    private Double pesoInicial;

    @NotNull(message = "La altura del plan no puede estar vacia")
    @DecimalMin(value = "1.0", message = "La altura del plan no puede ser mayor a 1.0")
    @DecimalMax(value = "2.5", message = "La altura del plan no puede ser mayor a 2.5")
    private Double altura;

    @NotNull(message = "La lista de ejercicios tiene que tener al menos 3 ejercicios")
    @Size(min = 3, message = "La lista de ejercicios tiene que tener al menos 3 ejercicios")
    private List<String> ejercicios;
}
