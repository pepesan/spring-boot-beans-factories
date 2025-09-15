package com.cursosdedesarrollo.springbootbeansfactories.beans;
import org.springframework.stereotype.Component;

// Bean con nombre "validadorCorto"
@Component("validadorCorto")
class ValidadorCorto implements Validador {
    public boolean valida(String s) { return s != null && s.length() >= 3; }
}
