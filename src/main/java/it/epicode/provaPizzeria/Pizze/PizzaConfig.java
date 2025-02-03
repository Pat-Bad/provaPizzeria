package it.epicode.provaPizzeria.Pizze;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {
    @Bean
    public Pizza pizzaMargherita(){
        Pizza p = new Pizza();
        p.setNome("Margherita");
        p.setPrezzo(8.99);
        return p;
    }
    @Bean
    public Pizza pizzaSalame(){
        Pizza p = new Pizza();
        p.setNome("Salame");
        p.setPrezzo(11.50);
        return p;
    }
    @Bean
    public Pizza pizzaCapricciosa(){
        Pizza s = new Pizza();
        s.setNome("Margherita");
        s.setPrezzo(8.99);
        return s;
    }
    @Bean
    public Pizza pizzaFunghi(){
        Pizza f = new Pizza();
        f.setNome("Funghi");
        f.setPrezzo(8.99);
        return f;
    }

}
