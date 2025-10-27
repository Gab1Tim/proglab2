package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Bulldoze extends PhysicalMove {
    public Bulldoze () {
        super(Type.GROUND, 60, 1.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect()
                .stat(Stat.SPEED, -1);

        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "using Bulldoze lowers opponent's Speed";
    }








}
