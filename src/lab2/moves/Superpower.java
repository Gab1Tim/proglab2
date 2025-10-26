package lab2.moves;

import ru.ifmo.se.pokemon.*;


public final class Superpower extends PhysicalMove{
    public Superpower () {
        super(Type.FIGHTING, 120,1.0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe(){
        return "using Superpower (Pokmon User loses Attack and Defense)";
    }
}
