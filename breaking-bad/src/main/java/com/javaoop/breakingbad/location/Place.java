package com.javaoop.breakingbad.location;

import java.util.Arrays;

public enum Place {
	JESSIES_PAD,
	WHITE_RESIDENCE,
	SCHOOL,
	LOS_POLLOS_HERMANOS,
	TUCOS_HOUSE,
	FRING_RESIDENCE,
	LAUNDROMAT,
	SCHRADER_RESIDENCE,
	CHICKEN_PLANT,
	PINKMAN_RESIDENCE,
	BENOKE_FABRICATORS,
	SAUL_GOODMAN_AND_ASSOCIATES,
	RV,
	DEA;
	
	@Override
	public String toString() {
		String[] words = this.name().split("\\_");

		return Arrays.stream(words)
			.map(word -> word.toLowerCase())
			.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1, word.length()))
			.reduce("", (current, next) -> current += (current.length() > 0 ? " " : "") + next);
	}
}
