package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class HornAttack extends PhysicalMove {
    public HornAttack () {
        super(Type.NORMAL, 65, 1.0);
    }
    @Override
    protected String describe() {
        return "using Horn Attack";
    }
}
