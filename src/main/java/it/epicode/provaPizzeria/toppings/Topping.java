package it.epicode.provaPizzeria.toppings;

import it.epicode.provaPizzeria.menu.elementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping implements elementoMenu {
    private String name;
    private double prezzo;


    public double prezzoElemento() {
        return prezzo;
    }

    @Override
    public String getNome() {
        return name;
    }
}
