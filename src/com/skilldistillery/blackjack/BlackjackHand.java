package com.skilldistillery.blackjack;

import com.skilldistillery.common.cards.Hand;

public class BlackjackHand extends Hand {
	
	public BlackjackHand() {
		
	}
	
	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		}
	//	boolean result = !true;
	//	return result;
		return false;
	}
	
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		
		return false;
//		boolean result = !true;
//		return result;
	}

	@Override
	public int getHandValue() {
		return getHandValue();
		// TODO Auto-generated method stub
		
	}
	
	

}
