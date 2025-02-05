package it.epicode.provaPizzeria.runner;

import it.epicode.provaPizzeria.menu.Menu;
import it.epicode.provaPizzeria.ordine.Ordine;
import it.epicode.provaPizzeria.ordine.StatoOrdine;
import it.epicode.provaPizzeria.tavolo.Tavolo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class applicationRunner implements CommandLineRunner {

    private final Menu menuNuovo;
    private final Tavolo tavolo1;


    @Override
    public void run(String... args) throws Exception {

        Ordine ordine2 = new Ordine();
        ordine2.setNumeroOrdine(3);
        ordine2.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine2.setNumeroCoperti(2);
        ordine2.setTavolo(tavolo1);
        ordine2.setCostoCoperto(2);
        ordine2.setElementiOrdinati(List.of(
                menuNuovo.getElementiMenu().get(0),
                menuNuovo.getElementiMenu().get(1),
                menuNuovo.getElementiMenu().get(2),
                menuNuovo.getElementiMenu().get(3)));


        ordine2.stampaOrdine();


    }
}
