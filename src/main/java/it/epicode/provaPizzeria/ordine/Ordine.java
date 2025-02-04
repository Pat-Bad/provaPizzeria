package it.epicode.provaPizzeria.ordine;

import it.epicode.provaPizzeria.calcoloPrezzi.elementoMenu;
import it.epicode.provaPizzeria.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int numeroOrdine;
    private String statoOrdine;
    private int numeroCoperti;
    private Time oraAcquisizione;
    //però io gli voglio passare una lista di oggetti...pizza, bevande e topping.....
    //cosa in comune che mi serve:prezzo
    private List<elementoMenu> elementiOrdinati = new ArrayList<>();
}
