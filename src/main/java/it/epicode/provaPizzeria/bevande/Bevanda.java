package it.epicode.provaPizzeria.bevande;

import it.epicode.provaPizzeria.menu.elementoMenu;
import it.epicode.provaPizzeria.stampa.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements elementoMenu, Printable {

    private String nome;
    private double prezzo;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String stampa() {
        return "Bevanda " + nome + ", prezzo " + prezzo + "€";
    }
}
