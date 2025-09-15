package com.cursosdedesarrollo.springbootbeansfactories.beans;

// Inyección avanzada: @Qualifier, @Primary, colecciones
interface Validador {
    boolean valida(String s);
}
