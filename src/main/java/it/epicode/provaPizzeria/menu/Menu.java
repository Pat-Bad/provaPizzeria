package it.epicode.provaPizzeria.menu;

import it.epicode.provaPizzeria.Pizze.Pizza;
import it.epicode.provaPizzeria.bevande.Bevanda;
import it.epicode.provaPizzeria.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    public String nome;
    List<elementoMenu> elementiMenu = new ArrayList();

}
