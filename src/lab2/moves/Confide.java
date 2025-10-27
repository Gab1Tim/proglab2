package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect()
                .stat(Stat.SPECIAL_ATTACK, -1);

        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "using Confide lowers the opponent's Special Attack";
    }

}
