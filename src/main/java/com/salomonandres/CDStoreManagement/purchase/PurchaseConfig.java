package com.salomonandres.CDStoreManagement.purchase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
@Configuration
public class PurchaseConfig {

    @Bean
    CommandLineRunner purchasecmd(PurchaseRepository repository){
        return args -> {
            Purchase purchase1 = new Purchase(new BigInteger("1"),new BigInteger("1"),300, LocalDate.of(1995,8,3));
            Purchase purchase2 = new Purchase(new BigInteger("1"),new BigInteger("2"),300, LocalDate.of(1995,8,3));
            Purchase purchase3 = new Purchase(new BigInteger("1"),new BigInteger("3"),300, LocalDate.of(1997,3,12));
            Purchase purchase4 = new Purchase(new BigInteger("1"),new BigInteger("1"),300, LocalDate.of(2002,4,4));
            Purchase purchase5 = new Purchase(new BigInteger("2"),new BigInteger("2"),300, LocalDate.of(2003,6,27));
            Purchase purchase6 = new Purchase(new BigInteger("3"),new BigInteger("2"),300, LocalDate.of(2003,7,31));
            Purchase purchase7 = new Purchase(new BigInteger("3"),new BigInteger("2"),300, LocalDate.of(2004,5,26));
            repository.saveAll(List.of(purchase1, purchase2, purchase3, purchase4, purchase5, purchase6, purchase7));
        };
    }
}
