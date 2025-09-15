package com.cursosdedesarrollo.springbootbeansfactories.beans.lazy;

import org.springframework.stereotype.Service;

@Service
class ServicioPesado {
    public ServicioPesado() { System.out.println("Construyendo ServicioPesado..."); }
}
