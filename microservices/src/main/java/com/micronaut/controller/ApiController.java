package com.micronaut.controller;

import com.micronaut.services.Mensagem;
import com.micronaut.services.MyHttpClient;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import java.util.List;

@Controller("/api")
@ExecuteOn(TaskExecutors.IO)  // Executa em um pool de threads para operações bloqueantes
public class ApiController {

    @Inject
    MyHttpClient myHttpClient;

    @Post("/send-mensagem")
    public void sendMessage(String content) {
        Mensagem mensagem = new Mensagem(content);
        myHttpClient.sendData(mensagem);
    }

    @Get("/get-mensagens")
    public List<Mensagem> getMessages() {
        return myHttpClient.callService();
    }
}