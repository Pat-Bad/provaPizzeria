package it.epicode.provaPizzeria.bevande;

import it.epicode.provaPizzeria.menu.elementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements elementoMenu {

    private String nome;
    private double prezzo;

    @Override
    public double getPrezzo() {
        return prezzo;
    }
    @Override
    public String getNome(){return nome;}
}
