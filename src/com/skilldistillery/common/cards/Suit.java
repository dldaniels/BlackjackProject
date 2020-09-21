package com.skilldistillery.common.cards;

public enum Suit {
	HEARTS("Hearts" + "\u2665"), SPADES("Spades" + "\u2660"), CLUBS("Clubs" + "\u2663"),
	DIAMONDS("Diamonds" + "\u2666");

	private String name;

	private Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
