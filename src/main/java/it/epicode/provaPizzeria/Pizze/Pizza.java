package it.epicode.provaPizzeria.Pizze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    private String nome;
    private double prezzo;
}
