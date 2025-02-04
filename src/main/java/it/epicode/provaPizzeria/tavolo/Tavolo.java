package it.epicode.provaPizzeria.tavolo;

import it.epicode.provaPizzeria.ordine.Ordine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMax;
    private boolean occupato;
}
