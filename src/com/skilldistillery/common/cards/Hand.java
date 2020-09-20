package com.skilldistillery.common.cards;

import java.util.List;

// abstract class hand
public abstract class Hand {
	// protected card list
	protected List<Card> cards;

	// hand no args constroctor
	public Hand() {

	}

	// hand constructor from fields
	public Hand(List<Card> cards) {
		this.cards = cards;
	}

	// abstract get hand value method
	public abstract int getHandValue();

	// method to add card to hand from deck
	public void addCard(Card card) {
		cards.add(card);
	}

	// method to clear hand
	public void clear() {
		cards.clear();

	}

	// getters and setters
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	//hashCode and equals
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
	if (!(obj instanceof Hand))
		return false;
	Hand other = (Hand) obj;
	if (cards == null) {
		if (other.cards != null)
			return false;
	} else if (!cards.equals(other.cards))
		return false;
	return true;
}
//to string
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Hand [cards=");
	builder.append(cards);
	builder.append("]");
	return builder.toString();
}


}