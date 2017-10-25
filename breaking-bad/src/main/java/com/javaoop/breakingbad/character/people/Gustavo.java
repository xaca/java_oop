package com.javaoop.breakingbad.character.people;

import java.util.Arrays;
import java.util.List;

import com.javaoop.breakingbad.character.Character;
import com.javaoop.breakingbad.location.Place;

public class Gustavo extends Character {

	@Override
	public List<String> catchphrases() {
		return Arrays.asList("Welcome to Los Pollos Hermanos!", "Well, get back to work.", "You can never trust a drug addict.");
	}

	@Override
	public Place getHome() {
		return Place.FRING_RESIDENCE;
	}

	@Override
	public Place getWork() {
		return Place.LOS_POLLOS_HERMANOS;
	}

}
