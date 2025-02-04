package it.epicode.provaPizzeria.bevande;

import it.epicode.provaPizzeria.calcoloPrezzi.elementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements elementoMenu {

    private String nome;
    private double prezzo;

    @Override
    public double prezzoElemento() {
        return prezzo;
    }
}
