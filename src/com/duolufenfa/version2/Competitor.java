package com.duolufenfa.version2;

import com.duolufenfa.version1.Outcome;

public interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
}
