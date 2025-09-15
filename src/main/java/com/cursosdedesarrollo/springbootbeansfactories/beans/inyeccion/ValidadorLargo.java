package com.cursosdedesarrollo.springbootbeansfactories.beans;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Bean con nombre "validadorLargo", es el Validador por defecto (@Primary)
@Component("validadorLargo")
@Primary
class ValidadorLargo implements Validador {
    public boolean valida(String s) { return s != null && s.length() >= 10; }
}
