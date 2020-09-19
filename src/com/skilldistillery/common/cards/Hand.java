package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.List;

// abstract class hand
public abstract class Hand {
	
	protected List<Card> cards;

	public Hand() {
		cards = new ArrayList <Card>();
		
		
	}
	
	public Hand(List<Card> cards) {
		cards = new ArrayList <Card>();
		this.cards = cards;
	}
	//method to add card to hand from deck
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear () {
		cards.clear();
		
	}
	
	public abstract int getHandValue();
	
	public List<Card> getCards() {
		return cards;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
