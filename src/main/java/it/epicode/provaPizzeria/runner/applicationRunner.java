package it.epicode.provaPizzeria.runner;

import it.epicode.provaPizzeria.menu.elementoMenu;
import it.epicode.provaPizzeria.menu.Menu;
import it.epicode.provaPizzeria.ordine.Ordine;
import it.epicode.provaPizzeria.ordine.StatoOrdine;
import it.epicode.provaPizzeria.tavolo.Tavolo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
@PropertySource("application.properties")
public class applicationRunner implements CommandLineRunner {
    private final Menu menuNuovo;

    @Override
    public void run(String... args) throws Exception {
        Ordine ordine2 = new Ordine();
        ordine2.setNumeroOrdine(3);
        ordine2.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine2.setNumeroCoperti(2);
        ordine2.setElementiOrdinati(List.of(
                menuNuovo.getElementiMenu().get(0),
                menuNuovo.getElementiMenu().get(0),
                menuNuovo.getElementiMenu().get(2),
                menuNuovo.getElementiMenu().get(3)));

        ordine2.stampaOrdine();



    }
}
