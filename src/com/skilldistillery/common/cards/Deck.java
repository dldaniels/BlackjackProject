package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// private card list
	private List<Card> cards;

	// Deck constructor
	public Deck() {
		cards = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}

	// method to find cards remaining in deck
	public int cardsLeftInDeck() {
		return cards.size();
	}

	// method to deal card
	public Card dealCard() {
		return cards.remove(0);

	}

	// method to shuffle deck
	public void shuffle() {
		Collections.shuffle(cards);
	}

	// method to check deck size
	public int checkDeckSize() {
		return cards.size();
	}

	// getters and setters
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	// hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Deck))
			return false;
		Deck other = (Deck) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		return true;
	}

	// to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deck [cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}

}
