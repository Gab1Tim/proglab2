package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class WoodHammer extends PhysicalMove {
    public WoodHammer() {
        super(Type.GRASS, 120, 1.0);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        int recoilAmount = 120 / 3;
        Effect recoil = new Effect()
                .stat(Stat.HP, -recoilAmount);
        p.addEffect(recoil);
    }

    @Override
    protected String describe() {
        return "uses Wood Hammer (takes recoil damage)";
    }
}
