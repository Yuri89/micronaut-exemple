package com.exampleapi.controller;

import com.exampleapi.model.Mensagem;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Body;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Controller("/mensagem")
@Singleton
public class SendMensagem {

    private final List<Mensagem> mensagens = new ArrayList<>(); // Renomeado para 'mensagens' (plural)

    @Post
    public void sendMessage(@Body Mensagem mensagem) {
        mensagens.add(mensagem); // Adiciona à lista 'mensagens'
    }

    @Get
    public List<Mensagem> getMessages() {
        return mensagens; // Retorna a lista de mensagens
    }
}
