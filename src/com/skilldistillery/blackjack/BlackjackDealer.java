package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Deck;
import com.skilldistillery.common.things.Player;

public class BlackjackDealer extends Player {
	private Deck deck;
	private BlackjackHand dealerHand;
	
	//Blackjack Dealer constructor
	public BlackjackDealer() {
		super();
		deck = new Deck();
		dealerHand = new BlackjackHand();
		super.setName("Dealer");
	}
	
	public void dealerRules() {
		if(dealerHand.getHandValue() <= 16) {
			deck.addCard();
		} 
	}
	
	public void addCard (Card card) {
		dealerHand.addCard(card);
	}
	
	public Card dealCard(Card card) {
		return cards.deal
	}
	
	
	
	

		
	
}
