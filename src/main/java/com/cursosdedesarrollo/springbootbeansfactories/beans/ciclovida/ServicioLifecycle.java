package com.cursosdedesarrollo.springbootbeansfactories.beans.ciclovida;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

// Ciclo de vida del Bean: @PostConstruct, @PreDestroy, InitializingBean, DisposableBean
// Revisar la clase de la Aplicación para ver el momento en que se crean y destruyen los beans
@Component
public class ServicioLifecycle implements InitializingBean, DisposableBean {

    @PostConstruct
    public void afterConstruct() {
        System.out.println("[ServicioLifecycle] @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("[ServicioLifecycle] InitializingBean.afterPropertiesSet()");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("[ServicioLifecycle] @PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("[ServicioLifecycle] DisposableBean.destroy()");
    }
}

