package lab2.moves;

import ru.ifmo.se.pokemon.*;


public final class Superpower extends PhysicalMove{
    public Superpower () {
        super(Type.FIGHTING, 120,1.0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect attackdDefenseDrop = new Effect();
        attackdDefenseDrop.stat(Stat.ATTACK ,-1);
        attackdDefenseDrop.stat(Stat.DEFENSE, -1);
        p.addEffect(attackdDefenseDrop);
    }

    @Override
    protected String describe(){
        return "using Superpower (Pokmon User loses Attack and Defense)";
    }
}
