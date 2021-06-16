package com.mvc.domain;

import lombok.Data;

// Lombok para los getters y setters
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
