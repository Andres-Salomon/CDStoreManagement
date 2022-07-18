package com.salomonandres.CDStoreManagement.song;

import com.salomonandres.CDStoreManagement.purchase.Purchase;
import com.salomonandres.CDStoreManagement.purchase.PurchaseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SongConfig {

    @Bean
    CommandLineRunner songcmd(SongRepository songRepository){
        return args -> {
            Song song1 = new Song("Hard Times",3.25);
            Song song2 = new Song("Ice capped",3.0);
            Song song3 = new Song("Marbles",4.2);
            Song song4 = new Song("On the hill",7.1);
            Song song5 = new Song("Spin Spin Spin",5.4);
            Song song6 = new Song("Run a big dream",3.3);
            Song song7 = new Song("Hi Score",4.4);
            Song song8 = new Song("En los cielos te veo",1.2);
            Song song9 = new Song("Con mi autito",2.2);
            Song song10 = new Song("Remando",3.3);
            Song song11 = new Song("Alas tenues",8.2);
            Song song12 = new Song("Benevolent",5.1);
            Song song13 = new Song("Coco a la miel",5.3);
            Song song14 = new Song("Herrero",3.5);
            Song song15 = new Song("Nubes de un barco azul",2.5);
            Song song16 = new Song("Chaleco de piedra",2.0);
            Song song17 = new Song("Fosforito",1.3);
            Song song18 = new Song("Quiero escuchar Té",3.2);
            Song song19 = new Song("Mercado Rojo",1.2);
            Song song20 = new Song("Hello you",3.3);
            Song song21 = new Song("Displaying now",1.2);
            Song song22 = new Song("Some words",3.4);
            Song song23 = new Song("Because I don't",1.2);
            Song song24 = new Song("Know",3.4);
            Song song25 = new Song("What to say",5.3);
            Song song26 = new Song("Pero nadie lo sabe",3.4);
            Song song27 = new Song("Así sigo",2.3);
            Song song28 = new Song("Así seguiré",1.4);
            Song song29 = new Song("Eso creo",3.4);
            songRepository.saveAll(List.of(
                    song1, song2, song3, song4, song5, song6, song7, song8, song9, song10, song11,
                    song12, song13, song14, song15, song16, song17, song18, song19, song20, song21,
                    song22, song23, song24, song25, song26, song27, song28, song29));
        };
    }
}
