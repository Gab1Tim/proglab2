package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Feebas extends Pokemon {
    public Feebas(String name, int level) {
        super(name, level);
        setStats(20,15,20,10,55,80);
        setType(Type.WATER);
        addMove(new Scald());
        addMove(new Confide());
        addMove(new Swagger());
    }
}
