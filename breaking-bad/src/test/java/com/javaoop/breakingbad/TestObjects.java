package com.javaoop.breakingbad;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javaoop.breakingbad.character.Character;
import com.javaoop.breakingbad.character.people.Gustavo;
import com.javaoop.breakingbad.character.people.Hank;
import com.javaoop.breakingbad.character.people.Jessie;
import com.javaoop.breakingbad.character.people.Skyler;
import com.javaoop.breakingbad.character.people.Walt;

public class TestObjects {

	private List<Character> characters;
	
	@Before
	public void setup() {
		characters = Arrays.asList(new Hank(), new Walt(), new Skyler(), new Jessie(), new Gustavo());
	}
	
	@Test
	public void testSpeak() {
		characters.forEach(character -> character.speak());
	}
	
	@Test
	public void testDoWork() {
		characters.forEach(character -> character.doWork());
	}
	
	@Test
	public void testGoHome() {
		characters.forEach(character -> character.goHome());
	}
}
