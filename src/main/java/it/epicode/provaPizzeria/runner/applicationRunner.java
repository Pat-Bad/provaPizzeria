package it.epicode.provaPizzeria.runner;

import it.epicode.provaPizzeria.calcoloPrezzi.elementoMenu;
import it.epicode.provaPizzeria.menu.Menu;
import it.epicode.provaPizzeria.ordine.Ordine;
import it.epicode.provaPizzeria.tavolo.Tavolo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@PropertySource("application.properties")
public class applicationRunner implements CommandLineRunner {
    private final Menu menuNuovo;
    private final Ordine ordine;
    private final Tavolo tavolo1;
    private final Ordine ordine1;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(menu);
       tavolo1.setOrdine(ordine1);
        System.out.println(ordine1);


    }
}
