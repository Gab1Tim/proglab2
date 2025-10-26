package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger() {
        super(Type.FAIRY, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, +2);
    }


    @Override
    protected String describe() {
        return "using Swagger (confuses opponent and raises Attack)";

    }
}
