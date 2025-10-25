package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class DazzlingGleam extends SpecialMove{
    public DazzlingGleam() {
        super(Type.FAIRY, 80,1.0);
    }

    @Override
    protected String describe() {
        return "using Dazzling Gleam";
    }
}
