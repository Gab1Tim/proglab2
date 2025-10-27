package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.FIRE)) {
            Effect effect = new Effect()
                    .chance(0.3)
                    .condition(Status.BURN);
            p.addEffect(effect);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.FREEZE) {
            Effect unfreeze = new Effect().condition(Status.NORMAL);
            p.setCondition(unfreeze);
        }
    }

    @Override
    protected String describe(){
        return "using Scald %30 percnt of burn";
    }
}
