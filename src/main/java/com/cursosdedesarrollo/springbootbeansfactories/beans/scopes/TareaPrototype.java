package com.cursosdedesarrollo.springbootbeansfactories.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// prototype: cada getBean() devuelve instancia nueva.
@Component
@Scope("prototype")
class TareaPrototype {
    private final long id = System.nanoTime();
    public long id() { return id; }
}
