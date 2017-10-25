package com.javaoop.breakingbad.character.people;

import java.util.Arrays;
import java.util.List;

import com.javaoop.breakingbad.character.Character;
import com.javaoop.breakingbad.location.Place;

public class Skyler extends Character {

	@Override
	public Place getHome() {
		return Place.WHITE_RESIDENCE;
	}

	@Override
	public Place getWork() {
		return Place.BENOKE_FABRICATORS;
	}

	@Override
	public List<String> catchphrases() {
		return Arrays.asList("Flynn, get your butt in here!", "I fucked Ted");
	}
}
