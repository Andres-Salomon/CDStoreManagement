package com.salomonandres.CDStoreManagement.artist;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class ArtistConfig {

        @Bean
        CommandLineRunner artistcmd(ArtistRepository repository){
            return args -> {
                Artist emilio = new Artist("Emilio Tunes");
                Artist julieta = new Artist("Julieta Venegas");
                Artist redondito = new Artist("Los ovalados");
                Artist metalcito = new Artist("Tornillos de Plastico");
                Artist susan = new Artist("Susan Tamadre");
                Artist remedio = new Artist("B.Pharm");
                Artist moni = new Artist("$DJMoneyCash$");
                repository.saveAll(List.of(emilio,julieta,redondito,metalcito,susan,remedio,moni));
            };
        }
}
