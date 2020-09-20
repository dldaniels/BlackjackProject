package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public int cardsLeftInDeck() {
		return cards.size();
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	
	}	
	
	public void dealHand(Hand hand) {
		
		Card dealCard = cards.remove(0);
		hand.addCard(dealCard);
		cards.remove(0);
		hand.addCard(dealCard);
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}
