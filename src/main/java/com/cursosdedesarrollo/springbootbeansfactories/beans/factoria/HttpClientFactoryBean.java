package com.cursosdedesarrollo.springbootbeansfactories.beans.factoria;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import java.net.http.HttpClient;
import java.time.Duration;


// FactoryBean<T>: crear objetos complejos como beans
@Component
public class HttpClientFactoryBean implements FactoryBean<HttpClient> {
    @Override
    public HttpClient getObject() {
        return HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build();
    }

    @Override
    public Class<?> getObjectType() { return HttpClient.class; }

    @Override
    public boolean isSingleton() { return true; }
}

