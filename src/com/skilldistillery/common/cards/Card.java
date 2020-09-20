package com.skilldistillery.common.cards;

public class Card {
	private Suit suit;
	private Rank rank;

	// Constructor to build card with assigned rank and suit
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	// get card value
	public int getValue() {
		return rank.getValue();
	}

	// hasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	// card to string
	@Override
	public String toString() {
		return rank + " of " + suit;
	}
}
