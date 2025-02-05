package it.epicode.provaPizzeria.Pizze;

import it.epicode.provaPizzeria.menu.elementoMenu;
import it.epicode.provaPizzeria.stampa.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza implements elementoMenu, Printable {
    private String nome;
    private double prezzo;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String stampa() {
        return "Pizza " + nome + ", prezzo " + prezzo + "€";
    }
}
