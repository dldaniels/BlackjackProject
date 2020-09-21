package com.skilldistillery.blackjack;

import java.util.List;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.things.Player;

public class BlackjackPlayer extends Player {
	private BlackjackHand playerHand;
	private int handValue;

	// constructor for blackjack player
	public BlackjackPlayer() {
		super();
		playerHand = new BlackjackHand();


	}

	// add card to player hand
	public void addCard(Card card) {
		playerHand.addCard(card);
	}

	// get player hand
	public void getPlayerHand() {
		List<Card> playerCards = playerHand.getCards();
		System.out.println();
		System.out.println("Player has");
		for (Card card : playerCards) {
			System.out.print(card + " ");
		}
		System.out.println("  Player hand value: " + getHandValue() + "\n");
	}

	// get hand value for player hand
	public int getHandValue() {
		handValue = playerHand.getHandValue();
		return handValue;
	}

	// check for player blackjack with player specific string added
	public boolean isBlackJack() {
		if (playerHand.isBlackJack() == true) {
			System.out.println("You got a blackjack");
			List<Card> playerCards = playerHand.getCards();
			for (Card card : playerCards) {
				System.out.println(card);
			}
			return true;
		}
		return false;
	}

	// check for player bust and adds player specific string added
	public boolean isBust() {
		if (playerHand.isBust() == true) {
			System.out.println("You Busted!!");
			return true;
		}
		return false;
	}

	// clear cards from previous player hand
	public void clear() {
		playerHand.clear();

	}
	// to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlackjackPlayer [playerHand=");
		builder.append(playerHand);
		builder.append(", handValue=");
		builder.append(handValue);
		builder.append("]");
		return builder.toString();
	}

}
