package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Florges extends Pokemon {
    public Florges(String name, int level) {
        super(name, level);
        setStats(78,65,68,122,154,75);
        setType(Type.FAIRY);
        addMove(new Rest());
        addMove(new DoubleTeam());
        addMove(new FairyWind());
        addMove(new Confide());
    }
}
