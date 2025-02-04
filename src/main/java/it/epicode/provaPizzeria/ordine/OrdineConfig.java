package it.epicode.provaPizzeria.ordine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;

@Configuration
public class OrdineConfig {
    @Bean
    public Ordine ordine () {
        Ordine ordine1 = new Ordine();
        ordine1.setNumeroOrdine(1);
        ordine1.setStatoOrdine("In corso");
        ordine1.setNumeroCoperti(2);
        ordine1.setOraAcquisizione(Time.valueOf("14:42:00"));
        ordine1.setElementiOrdinati(pizzaFunghi);

        return ordine1;}}
