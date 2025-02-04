package it.epicode.provaPizzeria.menu;

import it.epicode.provaPizzeria.Pizze.Pizza;
import it.epicode.provaPizzeria.bevande.Bevanda;
import it.epicode.provaPizzeria.toppings.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {
    @Autowired
    private Bevanda aranciata;
    @Autowired
    private Pizza pizzaFunghi;
    @Autowired
    private Topping abbondanteMozzarella;
    @Autowired
    private Pizza pizzaMargherita;

    @Bean
    public Menu menuNuovo(){
        Menu menuNuovo = new Menu();
        menuNuovo.setPizza(pizzaFunghi);
        menuNuovo.setBevanda(aranciata);
        menuNuovo.setTopping(abbondanteMozzarella);
        return menuNuovo;
    }



}
