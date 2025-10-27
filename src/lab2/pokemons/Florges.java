package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Florges extends Floette {
    public Florges(String name, int level) {
        super(name, level);
        setStats(78,65,68,122,154,75);
        addMove(new Confide());
    }
}
