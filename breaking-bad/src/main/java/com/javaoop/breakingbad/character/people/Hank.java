package com.javaoop.breakingbad.character.people;

import java.util.Arrays;
import java.util.List;

import com.javaoop.breakingbad.character.Character;
import com.javaoop.breakingbad.location.Place;

public class Hank extends Character {

	@Override
	public Place getHome() {
		return Place.SCHRADER_RESIDENCE;
	}

	@Override
	public Place getWork() {
		return Place.DEA;
	}

	@Override
	public List<String> catchphrases() {
		return Arrays.asList("They're minerals, Marie"
				, "My name is ASAC Schrader and you can go fuck yourself."
				, "You're the smartest guy I ever met... but you're too stupid to see... He made up his mind ten minutes ago.");
	}

}
