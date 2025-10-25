package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon p) {
        int newHP = (int) (p.getStat(Stat.HP) - p.getHP());
        p.setMod(Stat.HP, newHP);

        Effect sleepEffect = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(sleepEffect);
    }

}
