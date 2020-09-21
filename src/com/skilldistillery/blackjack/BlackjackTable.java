package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackTable {
	private BlackjackPlayer player;
	private BlackjackDealer dealer;
	private Deck deck;
	private Scanner kb;

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackjackTable app = new BlackjackTable();

		app.start();

	}

	private void start() {
		kb = new Scanner(System.in);
		launchGame();
		kb.close();
	}

	// Initiate a new game with new shuffled deck and will continue based on user
	// input choice
	private void dealHand() {
		checkDeck();

		player.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());

		player.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());

		player.getPlayerHand();
		dealer.dealersHand();

		isBlackjack();

		if (dealer.getHandValue() < 21 && player.getHandValue() < 21) {
			hitOrStay();
		}
	}


	// method for what happens when user choice is to stay
	private void playerStay() {
		System.out.println("You have chosen to stay");
		System.out.println();
		dealer.showDealersHand();
		// when user stays, dealer must stay if hand value is > 17 and hit if <= 16
		if (dealer.getHandValue() >= 17) {
			System.out.println("Dealer hand value: " + dealer.getHandValue());
			System.out.println("\nDealer must stay\n");
			winner();
		} else if (dealer.getHandValue() <= 16) {
			dealerHit();
		}
		if (player.getHandValue() <= 21 && dealer.getHandValue() < 17) {
			dealerHit();
			isBust();
			continuePlay();

			// } else if (dealer.getHandValue() > 16 && dealer.getHandValue() < 21) {
			// player.isBust();
			// checkWin();
		}

	}

	// continue game with same deck
	private void continuePlay() {
		System.out.println("Dealer: Want to go anohter round?");
		System.out.println("Enter Y for yes or N to quit");

		String choice = kb.next();

		switch (choice) {
		case "Y":
		case "y":
			dealHand();
			break;
		case "N":
		case "n":
			System.out.println("Dealer: Thanks for playing, come back soon!");
			break;
		default:
			System.out.println("Come on now....it is either Y or N. Try and play along here");
			choice = kb.next();
			break;
		}
	}

	private void isBlackjack() {
		if (player.isBlackJack() == true && dealer.isBlackjack() == true) {
			System.out.println("You and Dealer both have Blackjack! Thats a push!");
			continuePlay();
		}
		 else if (player.isBlackJack() == true || dealer.isBlackjack() == true) { 
			}
	}

	

	private void isBust() {
		if (player.isBust() == true || dealer.isBust() == true) {
			continuePlay();
		}
	}

	// method for player hit
	private void playerHit() {
		player.addCard(dealer.dealCard());
		player.getPlayerHand();
		isBust();
		if (player.getHandValue() < 22) {
			hitOrStay();
		}
		winner();
	

	}

	// method for dealerhit
	private void dealerHit() {
		while (dealer.getHandValue() < 17) {
			System.out.println("Dealer must hit");
			System.out.println("Dealer hits\n");
			dealer.addCard(dealer.dealCard());
			System.out.println(dealer.dealCard());
			System.out.println("Dealer hand value: " + dealer.getHandValue() + "\n");
			isBust();
		}
		winner();

	}

	// check for a win condition
	private void winner() {
		if (player.getHandValue() == dealer.getHandValue()) {
			dealer.showDealersHand();
			player.getPlayerHand();
			System.out.println("Thats a Push!\n");
			continuePlay();
		}
		if (player.getHandValue() > dealer.getHandValue() || dealer.getHandValue() > 21) {
			dealer.showDealersHand();
			player.getPlayerHand();
			System.out.println("Player wins!!! ");
			continuePlay();
		}
		if (player.getHandValue() < dealer.getHandValue() || player.getHandValue() > 21) {
			dealer.showDealersHand();
			player.getPlayerHand();
			System.out.println("Dealer wins!");
			continuePlay();

		}
		continuePlay();

	}

	// check deck size
	private void checkDeck() {
		player.clear();
		dealer.clear();
		dealer.dealerShuffle(deck);
		if (dealer.getDeckSize() < 10) {
			System.out.println();
			System.out.println("Shuffling new deck");
			Deck deck = new Deck();
			dealer.dealerShuffle(deck);
		}

	}



//Player walks up to table to start a game of blackjack
//welcome to the game
	private void launchGame() {
		player = new BlackjackPlayer();
		dealer = new BlackjackDealer();
		System.out.println("Dealer: Welcome to the Black Jack table, grab a seat and let me take your money");
		System.out.println("Dealer: Would you like to begin the game?");
		System.out.println();
		System.out.println("Enter Y to start or N to quit");

		String choice = kb.next();

		switch (choice) {
		case "Y":
		case "y":
			dealHand();
			break;
		case "N":
		case "n":
			System.out.println("Dealer: Come back and play again soon!");
			break;
		default:
			System.out.println("Dealer: I gave you two choices. It is either Y or N. Lets not be difficult here");
			choice = kb.next();
			break;
		}
	}
	// Option for player to hit or stay
	private void hitOrStay() {
		System.out.println("Enter H to hit");
		System.out.println("Enter S to stay");
		String choice = kb.next();
		
		switch (choice) {
		case "H":
		case "h":
			playerHit();
			break;
		case "S":
		case "s":
			playerStay();
			break;
		default:
			System.out.println("I have given you two options. Pick one of em, lets not be difficult here dude");
			choice = kb.next();
			break;
			
		}
	}
}