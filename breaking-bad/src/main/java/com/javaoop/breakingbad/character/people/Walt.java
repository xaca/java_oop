package com.javaoop.breakingbad.character.people;

import java.util.Arrays;
import java.util.List;

import com.javaoop.breakingbad.character.Character;
import com.javaoop.breakingbad.location.Place;

public class Walt extends Character {

	@Override
	public List<String> catchphrases() {
		return Arrays.asList("Say my name.", "I am the one who knocks.", "Jessie, we need to cook.");
	}

	@Override
	public Place getHome() {
		return Place.WHITE_RESIDENCE;
	}

	@Override
	public Place getWork() {
		return Place.LAUNDROMAT;
	}
}
