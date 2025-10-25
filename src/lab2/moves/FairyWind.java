package lab2.moves;

import ru.ifmo.se.pokemon.*;

public final class FairyWind extends SpecialMove {
    public FairyWind(){
        super(Type.FAIRY,40,1.00);
    }

    @Override
    protected String describe(){
        return "using Fairy Wind";
    }
}
