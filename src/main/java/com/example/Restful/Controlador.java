package com.example.Restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationPropertiesScan
public class Controlador {

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @Autowired
    Configuracion configuracion;

    //GET
    // localhost:8081/parametros
    @GetMapping("/parametros")
    public String dameParametros(){

        return "La URL es: " + url.toString() + " la password es: " + password.toString();
    }

    //GET
    // localhost:8081/miconfiguracion
    @GetMapping("/miconfiguracion")
    public String dameConfiguracion(){

        return "valor1 es: " + configuracion.getValor1() + " valor2 es: " + configuracion.getValor2();
    }

}
