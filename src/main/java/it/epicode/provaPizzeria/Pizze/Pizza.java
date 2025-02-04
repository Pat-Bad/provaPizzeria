package it.epicode.provaPizzeria.Pizze;

import it.epicode.provaPizzeria.menu.elementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza implements elementoMenu {
    private String nome;
    private double prezzo;

    @Override
    public double getPrezzo() {
        return prezzo;
    }
}
