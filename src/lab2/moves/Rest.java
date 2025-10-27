package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.NORMAL, 0, 0);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect restEffect = new Effect()
                .stat(Stat.HP, (int)(p.getStat(Stat.HP) - p.getHP()))  // eksik HP kadar iyileştir
                .condition(Status.SLEEP)   // uyku durumu uygula
                .turns(2);                 // 2 tur sürer

        p.addEffect(restEffect);
    }

    @Override
    protected String describe() {
        return "uses Rest and falls asleep (fully healed)";
    }

}
