package com.duolufenfa.version2;

import static com.duolufenfa.version1.Outcome.*;

import com.duolufenfa.version1.Outcome;

public enum RoShamBo2 implements Competitor<RoShamBo2> {
	
    PAPER(DRAW, LOSE, WIN),  
    SCISSORS(WIN, DRAW, LOSE),  
    ROCK(LOSE, WIN, DRAW);  
  
    private Outcome vPAPER, vSCISSOR, vROCK;  
  
    RoShamBo2(Outcome paper, Outcome scissor, Outcome rock){  
        this.vPAPER = paper;  
        this.vSCISSOR = scissor;  
        this.vROCK = rock;  
    }  

	public static void main(String[] args) {
		RoShamBo.play(RoShamBo2.class, 20);
	}

	@Override
	public Outcome compete(RoShamBo2 competitor) {
		switch(competitor){  
        default:  
            case PAPER : return vPAPER;  
            case SCISSORS : return vSCISSOR;  
            case ROCK : return vROCK;  
		}
	}

}
