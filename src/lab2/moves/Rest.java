package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect restEffect = new Effect()
                .stat(Stat.HP, (int)(p.getStat(Stat.HP) - p.getHP()))
                .condition(Status.SLEEP)
                .turns(2);

        p.addEffect(restEffect);
    }

    @Override
    protected String describe() {
        return "uses Rest and falls asleep (fully healed)";
    }

}
