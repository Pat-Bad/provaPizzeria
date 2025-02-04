package it.epicode.provaPizzeria.ordine;

import it.epicode.provaPizzeria.calcoloPrezzi.elementoMenu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class OrdineConfig {
    @Bean
    public Ordine ordine () {
        List<elementoMenu> elementiOrdinati = new ArrayList<>();

        Ordine ordine1 = new Ordine();
        ordine1.setNumeroOrdine(1);
        ordine1.setStatoOrdine("In corso");
        ordine1.setNumeroCoperti(2);
        ordine1.setOraAcquisizione(Time.valueOf("14:42:00"));


        return ordine1;}}
