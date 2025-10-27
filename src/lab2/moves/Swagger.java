package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger() {
        super(Type.FAIRY, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect()
                .stat(Stat.ATTACK, +2);
        p.addEffect(effect);

        Effect.confuse(p);
    }


    @Override
    protected String describe() {
        return "using Swagger (confuses opponent and raises Attack)";

    }
}
