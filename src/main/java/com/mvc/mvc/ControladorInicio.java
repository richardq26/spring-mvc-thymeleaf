package com.mvc.mvc;

import java.util.Arrays;

import com.mvc.domain.Persona;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ControladorInicio {
    // No el value de lombok
    // el index.saludo es del properties
    @Value("${index.saludo}")
    private String saludo;
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola con thymeleaf";
        var persona = new Persona();
        persona.setNombre("Richard");
        persona.setApellido("QQueccaño");
        persona.setEmail("richard@richard.com");
        persona.setTelefono("987654321");

        var persona2 = new Persona();
        persona2.setNombre("R");
        persona2.setApellido("Backend");
        persona2.setEmail("r@richard.com");
        persona2.setTelefono("99999991");

        // var personas = new ArrayList<Persona>();
        var personas = Arrays.asList(persona, persona2);
        // llave: valor, similar a servlets
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
        // model.addAttribute("persona",persona);
        model.addAttribute("personas",personas);
        log.info("aaaa");
        return "index";
    }
}
