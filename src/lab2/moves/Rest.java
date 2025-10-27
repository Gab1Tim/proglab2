package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.NORMAL, 0, 0);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        int missingHP = (int) (p.getStat(Stat.HP) - p.getHP());
        p.setMod(Stat.HP, missingHP);

        Effect sleep = new Effect()
                .condition(Status.SLEEP)
                .turns(2);
        p.addEffect(sleep);
    }

    @Override
    protected String describe() {
        return "uses Rest and falls asleep (fully healed)";
    }

}
