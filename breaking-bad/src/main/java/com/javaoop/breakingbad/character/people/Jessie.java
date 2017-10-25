package com.javaoop.breakingbad.character.people;

import java.util.Arrays;
import java.util.List;

import com.javaoop.breakingbad.character.Character;
import com.javaoop.breakingbad.location.Place;

public class Jessie extends Character {

	@Override
	public List<String> catchphrases() {
		return Arrays.asList("Yeah Mr White! Yeah Science!", "Yeah bitch!", "Yo!");
	}

	@Override
	public Place getHome() {
		return Place.PINKMAN_RESIDENCE;
	}

	@Override
	public Place getWork() {
		return Place.RV;
	}

}
