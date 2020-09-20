package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Hand;

public class BlackjackHand extends Hand {
	private int handValue;

	public BlackjackHand() {
		super();
	}

	// abstract getHandValue
	@Override
	public int getHandValue() {
		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;

	}

	// checks for blackjack
	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		} else
			return false;
	}

	// checks for bust
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		} else

			return false;
	}

//	//is hard (optional)
//	public boolean isHard() {
//		
//	}
//	
//	//is soft (optional) 
//	public boolean isSoft() {
//		
//	}

}
