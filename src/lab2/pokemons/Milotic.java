package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Milotic extends Pokemon {
    public Milotic(String name, int level) {
        super(name, level);
        setStats(95,69,79,100,125,81);
        setType(Type.WATER);
        addMove(new Scald());
        addMove(new Confide());
        addMove(new Swagger());
        addMove(new Bulldoze());
    }
}
