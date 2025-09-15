package com.cursosdedesarrollo.springbootbeansfactories.beans.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.annotation.ScopedProxyMode;

// request: requiere entorno web. Con proxyMode, inyectas un proxy seguro en singletons.
@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
class EstadoRequest {
    private final long id = System.nanoTime();
    public long id() { return id; }
}
