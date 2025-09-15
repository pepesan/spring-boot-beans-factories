package com.cursosdedesarrollo.springbootbeansfactories.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
class ValidadorServicio {
    private final Validador preferente;
    private final Validador especifico;
    private final List<Validador> todos;
    private final Map<String, Validador> porNombre;

    public ValidadorServicio(Validador preferente,
                             @Qualifier("validadorCorto") Validador especifico,
                             List<Validador> todos,
                             Map<String, Validador> porNombre) {
        this.preferente = preferente;    // inyecta @Primary
        this.especifico = especifico;    // inyecta el cualificado
        this.todos = todos;              // colección ordenada
        this.porNombre = porNombre;      // mapa beanName->bean
    }

    public void demo() {
        System.out.println("Preferente (Largo): " + preferente.valida("1234567890"));
        System.out.println("Especifico (Corto): " + especifico.valida("123"));
        System.out.println("Total validadores: " + todos.size());
        System.out.println("Tiene 'validadorCorto'? " + porNombre.containsKey("validadorCorto"));
    }
}

