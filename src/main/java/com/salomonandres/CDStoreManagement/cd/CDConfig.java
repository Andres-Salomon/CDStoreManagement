package com.salomonandres.CDStoreManagement.cd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CDConfig {

    @Bean
    CommandLineRunner cdcmd(CDRepository repository){
        return args -> {
            CD torn = new CD("Torned Apart",45.35,150,"los ovalados",LocalDate.of(2003,4,30));
            CD arm = new CD("Arm my mind",34.23,245,"Susan Tamadre",LocalDate.of(2016,5,13));
            CD luv = new CD("Love disco",16.6,80,"B.Pharm", LocalDate.of(1995,8,3));
            repository.saveAll(List.of(torn,arm,luv));
        };
    }
}
