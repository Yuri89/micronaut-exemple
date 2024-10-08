package com.micronaut.services;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import java.util.List; // Importando List para usar no retorno

@Client("http://localhost:8081")  // URL do seu microserviço Micronaut
public interface MyHttpClient {

    @Get("/mensagem")  // Ajuste a rota para a que você configurou no microserviço
    List<Mensagem> callService();  // Mudando o tipo de retorno para List<String>

    @Post("/mensagem")  // Ajuste a rota para a que você configurou no microserviço
    void sendData(@Body Mensagem data);  // Mudando o tipo do corpo para Mensagem
}
