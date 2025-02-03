package it.epicode.provaPizzeria.bevande;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {
    @Bean
    public Bevanda aranciata () {
        Bevanda b = new Bevanda();
        b.setNome("Aranciata");
        b.setPrezzo(3.50);
        return b;
    }

}
