package it.epicode.provaPizzeria.stampa;

import it.epicode.provaPizzeria.menu.elementoMenu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StampaElementoMenu {
    public String stampaElementoMenu(elementoMenu e) {
        return e.getNome() + " " + e.getPrezzo() + "€";

    }
}
