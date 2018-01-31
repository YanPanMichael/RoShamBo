package com.duolufenfa.version6;

import static com.duolufenfa.version1.Outcome.*;

import com.duolufenfa.version1.Outcome;
import com.duolufenfa.version2.Competitor;
import com.duolufenfa.version2.RoShamBo;

public enum RoShamBo6 implements Competitor<RoShamBo6>
{
    PAPER, SCISSORS, ROCK;

    private static Outcome[][] table = { 

        {DRAW, LOSE, WIN},// PAPER

        {WIN, DRAW, LOSE},// SCISSORS

        {LOSE, WIN, DRAW}// ROCK

    };
    
    @Override
    public Outcome compete(RoShamBo6 other)
    {
    	return table[this.ordinal()][other.ordinal()];
    }

    public static void main(String[] args)
    {
        RoShamBo.play(RoShamBo6.class, 10);
    }

}