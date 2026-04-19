package com.programacion4.unidad4ej5.config;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import jakarta.validation.Constraint;

@Target({ ElementType.FIELD }) // 
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidacionFecha.class) 
public @interface MayorDeEdad {
    String message() default "El socio debe ser mayor de 18 años";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}