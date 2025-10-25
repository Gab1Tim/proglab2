package lab2;

import ru.ifmo.se.pokemon.*;
import lab2.pokemons.*;
import lab2.moves.*;

public class Main {
    public static void main(String[] args) {

        Battle battle = new Battle();


        Pokemon tapuFini = new TapuFini("Tapu-Fini", 5);
        Pokemon feebas = new Feebas("Feebas", 5);
        Pokemon milotic = new Milotic("Milotic", 5);

        Pokemon flabebe = new Flabebe("Flabebe", 5);
        Pokemon floette = new Floette("Floette", 5);
        Pokemon florges = new Florges("Florges", 5);

        battle.addAlly(tapuFini);
        battle.addAlly(feebas);
        battle.addAlly(milotic);

        battle.addFoe(flabebe);
        battle.addFoe(floette);
        battle.addFoe(florges);

        battle.go();
    }
}

