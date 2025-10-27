package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class WoodHammer extends PhysicalMove {
    public WoodHammer() {
        super(Type.GRASS, 120, 1.0);
    }


    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        int recoil = (int)(damage / 3);
        p.setMod(Stat.HP, -recoil);
    }

    @Override
    protected String describe() {
        return "uses Wood Hammer (takes recoil damage)";
    }
}
