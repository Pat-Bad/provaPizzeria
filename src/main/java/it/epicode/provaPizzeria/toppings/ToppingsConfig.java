package it.epicode.provaPizzeria.toppings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class ToppingsConfig {
    @Bean
    public Topping abbondanteMozzarella(){
        Topping formaggio = new Topping();
        formaggio.setName("Mozzarella abbondante");
        formaggio.setPrezzo(3);
        return formaggio;


    }

    @Bean
    public Topping alici(){
        Topping alici = new Topping();
        alici.setName("alici");
        alici.setPrezzo(2);
        return alici;

    }
}
