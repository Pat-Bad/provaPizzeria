package it.epicode.provaPizzeria.tavolo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TavoloConfig {
    @Bean
    public Tavolo tavolo1(){
        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);
        tavolo.setNumeroCopertiMax(4);
        tavolo.setOccupato(true);
        return tavolo;
    }
}
