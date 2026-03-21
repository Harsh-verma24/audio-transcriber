package com.spideyharsh.audiotranscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AudioTranscriberApplication {

    public static void main(String[] args) {
        SpringApplication.run(AudioTranscriberApplication.class, args);
    }

    @org.springframework.context.annotation.Bean
    public org.springframework.web.client.RestClient restClient() {
        return org.springframework.web.client.RestClient.create();
    }

    @org.springframework.context.annotation.Bean
    public org.springframework.web.reactive.function.client.WebClient webClient() {
        return org.springframework.web.reactive.function.client.WebClient.builder().build();
    }
}
