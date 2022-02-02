package com.example.Restful;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class Configuracion {

    @Value("${valor1}")
    private String valor1;

    @Value("${valor2}")
    private String valor2;

    @PostConstruct
    public void mostrarInicio(){
        System.out.println(valor1);
        System.out.println(valor2);
    }

    public String getValor1() {
            return valor1;
        }

        public void setValor1(String valor1) {
            this.valor1 = valor1;
        }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

}
