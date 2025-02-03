package it.epicode.provaPizzeria.toppings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor public class Topping {
    private String name;
    private double prezzo;
}
