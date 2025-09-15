package com.cursosdedesarrollo.springbootbeansfactories.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Personalización del ciclo con BeanPostProcessor (mide tiempo de init)
@Component
public class InitTimingPostProcessor implements BeanPostProcessor {
    private final Map<String, Long> start = new ConcurrentHashMap<>();

    /*
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        start.put(beanName, System.nanoTime());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Long t0 = start.remove(beanName);
        if (t0 != null) {
            long ms = (System.nanoTime() - t0) / 1_000_000;
            System.out.printf("[InitTiming] %s inicializado en %d ms%n", beanName, ms);
        }
        return bean;
    }

     */
}

