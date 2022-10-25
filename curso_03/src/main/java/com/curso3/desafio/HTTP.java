package com.curso3.desafio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import javax.swing.JOptionPane;

import java.net.http.HttpResponse;

public class HTTP {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        String url = JOptionPane.showInputDialog(null, "Digite uma url");
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();
    }
}
