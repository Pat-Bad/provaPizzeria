package it.epicode.provaPizzeria.conf;

import it.epicode.provaPizzeria.Pizze.Pizza;
import it.epicode.provaPizzeria.bevande.Bevanda;
import it.epicode.provaPizzeria.stampa.StampaElementoMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
public class PizzaConfigTest {
    @Autowired
    private Pizza pizzaFunghi;
    @Autowired
    private Pizza pizzaCapricciosa;
    @Autowired
    private Bevanda aranciata;
    @Autowired
    private StampaElementoMenu stampaElementoMenu;

    @Test
    @DisplayName("test pizza ai funghi controllo valori inseriti")
    public void testPizzaFunghi() {
        assertEquals(8.99, pizzaFunghi.getPrezzo());
        assertEquals("Funghi", pizzaFunghi.getNome());
    }

    @Test
    @DisplayName("test controllo valori pizza capricciosa")
    public void testPizzaCapricciosa() {
        assertEquals(8.99, pizzaCapricciosa.getPrezzo());
        assertEquals("Margherita", pizzaCapricciosa.getNome());
    }

    @Test
    @DisplayName("test controllo valori aranciata")
    public void testAranciata() {
        assertEquals(3.50, aranciata.getPrezzo());
        assertEquals("Aranciata", aranciata.getNome());
    }

    @ParameterizedTest
    @CsvSource({
            "Speck e funghi, 17.50",
            "Tonno e cipolla, 13.50",
            "Salame piccante, 10",
            "Vegetariana, 11.50"
    })
    @DisplayName("test controllo corretto inserimento pizze")
    public void testPizze(String nome, double prezzo) {
        Pizza p = new Pizza();
        p.setNome(nome);
        p.setPrezzo(prezzo);

        assertEquals(prezzo, p.getPrezzo());
        assertNotEquals("Melanzane", nome);
        p.stampa();
    }

    @ParameterizedTest
    @CsvSource({
            "Coca Cola, 3.50",
            "Spuma, 3.50",
            "Birra, 5",
            "Acqua Tonica, 3.50"
    })
    @DisplayName("test controllo corretto inserimento bevande")
    public void testBevande(String nome, double prezzo) {
        Bevanda b = new Bevanda();
        b.setNome(nome);
        b.setPrezzo(prezzo);

        assertEquals(prezzo, b.getPrezzo());
        b.stampa();

        assertNotNull("Coca Cola", b.getNome());

    }

}
