package com.cursosdedesarrollo.springbootbeansfactories.beans.condicionales;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

// Pillamos el valor de feature.x.enabled de las propiedades o variables de entorno
class OnFeatureXEnabled implements Condition {
    @Override
    public boolean matches(ConditionContext ctx, AnnotatedTypeMetadata md) {
        String enabled = ctx.getEnvironment().getProperty("feature.x.enabled", "false");
        return Boolean.parseBoolean(enabled);
    }
}

