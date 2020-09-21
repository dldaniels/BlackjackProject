package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Hand;

public class BlackjackHand extends Hand {
	private int handValue;

	public BlackjackHand() {

	}
	// abstract get hand value method
	@Override
	public int getHandValue() {
		handValue = 0;
		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;

	}

	// checks for blackjack condition within blackjack hand
	public boolean isBlackJack() {
		if (getHandValue() == 21 && cards.size() == 2) {
			return true;
		} else
			return false;
	}

	// checks for bust condition within blackjack hand
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		} else
			return false;
	}

}
