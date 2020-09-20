package com.skilldistillery.blackjack;

import com.skilldistillery.common.things.Player;

public class BlackjackPlayer extends Player{

//	public BlackjackPlayer() {
//		super();
//	}
	
	BlackjackHand playerHand = new BlackjackHand();
	
	public BlackjackPlayer() {
		super.setName("Player 1");
	}
	
	public int getHand() {
		return playerHand.getHandValue();
		
	}

}
