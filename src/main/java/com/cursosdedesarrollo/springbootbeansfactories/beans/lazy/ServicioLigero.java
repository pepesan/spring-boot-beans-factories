package com.cursosdedesarrollo.springbootbeansfactories.beans.lazy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

// Carga diferida: @Lazy (útil para romper ciclos o mejorar arranque)
@Service
class ServicioLigero {
    private final ServicioPesado pesado;

    public ServicioLigero(@Lazy ServicioPesado pesado) {
        this.pesado = pesado; // no se crea hasta que lo usamos
    }

    public void usar() {
        System.out.println("Voy a usar el pesado...");
        pesado.toString(); // dispara la creación
    }
}
