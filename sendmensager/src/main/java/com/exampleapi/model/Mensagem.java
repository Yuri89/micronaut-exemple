package com.exampleapi.model;

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
