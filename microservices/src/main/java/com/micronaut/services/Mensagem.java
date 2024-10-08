package com.micronaut.services;  // Certifique-se de que está no mesmo pacote ou importe corretamente

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Mensagem {
    private String content;

    public Mensagem(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
