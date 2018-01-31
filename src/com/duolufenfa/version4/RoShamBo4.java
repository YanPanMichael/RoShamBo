package com.duolufenfa.version4;

import com.duolufenfa.version1.Outcome;
import com.duolufenfa.version2.Competitor;
import com.duolufenfa.version2.RoShamBo;

public enum RoShamBo4 implements Competitor<RoShamBo4>{
	ROCK{
		public Outcome compete(RoShamBo4 opponent){
			return compete(SCISSORS, opponent);
		}
	},
	SCISSORS{
		public Outcome compete(RoShamBo4 opponent){
			return compete(PAPER, opponent);
		}
	},
	PAPER{
		public Outcome compete(RoShamBo4 opponent){
			return compete(ROCK, opponent);
		}
	};
	
	Outcome compete(RoShamBo4 loser, RoShamBo4 opponent){
		return ((opponent == this) ? Outcome.DRAW
			: ((opponent == loser) ? Outcome.WIN
					: Outcome.LOSE));
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo4.class, 20);
	}
}