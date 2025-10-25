package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Bulldoze extends PhysicalMove {
    public Bulldoze () {
        super(Type.GROUND, 60, 1.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPEED, -1));
    }
    @Override
    protected String describe(){
        return "using Bulldoze lowers opponent's Speed";
    }








}
