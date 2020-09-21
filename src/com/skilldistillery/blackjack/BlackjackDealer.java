package com.skilldistillery.blackjack;

import java.util.Collections;
import java.util.List;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Deck;
import com.skilldistillery.common.things.Player;

public class BlackjackDealer extends Player {
	private BlackjackHand dealerHand;
	private Deck deckOfCards;
	private int handValue;

	// dealer constructor
	public BlackjackDealer() {
		super();
		deckOfCards = new Deck();
		dealerHand = new BlackjackHand();
		super.setName("Dealer");
	}
	// method for dealer to shuffle deck
	public void dealerShuffle(Deck d) {
		List<Card> deck = deckOfCards.getCards();
		Collections.shuffle(deck);

	}

	// add card to hand
	public void addCard(Card card) {
		dealerHand.addCard(card);
	}


	// get hand value from dealer hand
	public int getHandValue() {
		handValue = dealerHand.getHandValue();
		return handValue;

	}

	// dealers hand with first card face down and value hidden
	public void dealersHand() {
		List<Card> dealerCards = dealerHand.getCards();
		System.out.println("Dealer has");
		for (int i = 0; i < dealerCards.size(); i++) {
			if (i == 0) {
				System.out.print("**Face Down** ");
			} else {
				System.out.println(dealerCards.get(i) + "\n");
			}
		}
	}

	// show dealer hand
	public void showDealersHand() {
		List<Card> dealerCards = dealerHand.getCards();
		System.out.println("Dealer has ");
		for (int i = 0; i < dealerCards.size(); i++) {
			System.out.print(dealerCards.get(i) + " ");
		}
		System.out.print(" Dealer hand value: " + getHandValue() + "\n");
	}


	// dealer is bust condition with dealer specific string added
	public boolean isBust() {
		if (dealerHand.isBust() == true) {
			System.out.println("Dealer has busted");
			return true;
		}
		return false;
	}
	// getDeckSize
	public int getDeckSize() {
		List<Card> cardDeck = deckOfCards.getCards();
		return cardDeck.size();
	}

	// dealer clears cards from previous hand
	public void clear() {
		dealerHand.clear();
	}
	// method for dealer to dealer card from deck
	public Card dealCard() {
		return deckOfCards.dealCard();
	}
	// shows if dealer has blackjack with dealer specific string added
	public boolean isBlackjack() {
		if (dealerHand.isBlackJack() == true) {
			System.out.println("Dealer has Blackjack!");
			List<Card> dealerCards = dealerHand.getCards();
			for (Card card : dealerCards) {
				System.out.println(card);
			}
			
			return true;
			
		}
		return false;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dealer Hand: ");
		builder.append(dealerHand + "/n");
		builder.append(", cards=");
		builder.append(deckOfCards);
		builder.append(", handValue=");
		builder.append(handValue);
		builder.append("]");
		return builder.toString();
	}

}
