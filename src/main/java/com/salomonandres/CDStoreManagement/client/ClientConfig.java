package com.salomonandres.CDStoreManagement.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner clientcmd(ClientRepository repository){
        return args -> {
            Client julieta = new Client("Julieta","Schultz","Mozart 2300",2124,"julietaschultz@gmail.com");
            Client joaquin = new Client("Joaquín","Schultz","Mozart 2300",2124,"joacoschultz@gmail.com");
            Client roberto = new Client("Roberto","Schultz","Mozart 2300",2124, "rschultz@gmail.com");
            repository.saveAll(List.of(julieta,joaquin,roberto));
        };
    }
}
