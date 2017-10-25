package com.javaoop.breakingbad.character;

import java.util.List;

import com.javaoop.breakingbad.location.Place;

public abstract class Character {

	public void speak() {
		int index = (int)(Math.random() * catchphrases().size());
		System.out.println(getName() + " says, \"" + catchphrases().get(index) + "\"");
	}
	
	public void doWork() {
		String workStr = getWork() != null ? getWork().toString() : "the office";
		System.out.println(getName() + " is going to " + workStr + " to work.");
	}

	public void goHome() {
		String homeStr = getHome() != null ? getHome().toString() : "home";
		System.out.println(getName() + " is going to " + homeStr + " after a long day.");
	}
	
	private String getName() {
		return this.getClass().getSimpleName();
	}
	
	protected abstract Place getHome();
	protected abstract Place getWork();
	protected abstract List<String> catchphrases();
}
