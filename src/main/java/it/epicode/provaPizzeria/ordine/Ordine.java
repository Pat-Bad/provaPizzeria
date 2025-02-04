package it.epicode.provaPizzeria.ordine;

import it.epicode.provaPizzeria.menu.elementoMenu;
import it.epicode.provaPizzeria.tavolo.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private Time oraAcquisizione;
    private List<elementoMenu> elementiOrdinati = new ArrayList<>();
    @Value("${costoCoperto.prezzo}")
    private double costoCoperto;

    public double calcolaTotaleCoperto(){
        double totaleCoperto = costoCoperto * numeroCoperti;
        double sommaPrezzi = elementiOrdinati.stream().mapToDouble(elementoMenu::getPrezzo).sum();
        return totaleCoperto + sommaPrezzi;
    }
public void stampaOrdine(){
    System.out.println("Numero ordine: " + numeroOrdine);
    System.out.println("Tavolo: " + tavolo);
    System.out.println("Elementi ordine: ");
    for (elementoMenu e :elementiOrdinati) System.out.println(e);
    System.out.println("Costo totale: " + calcolaTotaleCoperto());;
}
}
