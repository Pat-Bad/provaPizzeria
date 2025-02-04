package it.epicode.provaPizzeria.menu;

import it.epicode.provaPizzeria.Pizze.Pizza;
import it.epicode.provaPizzeria.bevande.Bevanda;
import it.epicode.provaPizzeria.toppings.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
    private final Bevanda aranciata;
    private final Pizza pizzaFunghi;
    private final Topping abbondanteMozzarella;
    private final Pizza pizzaMargherita;

    @Bean
    public Menu menuNuovo(){
        Menu menuNuovo = new Menu();
        menuNuovo.setElementiMenu(List.of(pizzaFunghi,aranciata,abbondanteMozzarella, pizzaMargherita));

        return menuNuovo;
    }



}
