package com.skilldistillery.blackjack;


import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.cards.*;

public class BlackjackApplication {

	private BlackjackHand playHand = new BlackjackHand();
	private BlackjackHand dealHand = new BlackjackHand();
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BlackjackApplication bja = new BlackjackApplication();
		
		bja.play(kb);
		
		kb.close();
	}

	private void play(Scanner kb) {
		
		/*
		 * 	Will deal the starting cards to player
		 *	dealer. two each, one at a time.
		 *  
		 *  Will check for black jack for player,

		 *  If player has bj then dealer check for
		 *  a tie, if no dealer bj then player wins
		 *  
		 *  If dealer has bj and play does not 
		 *  then dealer wins. 
		 *  
		 *  Compare value of player and dealer 
		 *  to determine winner.
		 */
		int playerCount, dealerCount;
		Deck deck = new Deck();
		
		deck.shuffle();
		Card pCard1 = deck.dealCard();
		Card dCard1 = deck.dealCard();
		
		Card pCard2 = deck.dealCard();
		Card dCard2 = deck.dealCard();
		
		playHand.addCard(pCard1);
		playHand.addCard(pCard2);
		dealHand.addCard(dCard1);
		dealHand.addCard(dCard2);
		System.out.println();

		System.out.println("--------------");
		System.out.println("| Your Cards |");
		System.out.println("--------------");
		playerCount = pCard1.getValue() + pCard2.getValue();
		System.out.println(playHand.toString() + playerCount);
		//System.out.println(Rank.JACK.toString());

	
		System.out.println();

		System.out.println("----------------");
		System.out.println("| Dealer Cards |");
		System.out.println("----------------");
		
		dealerCount = dCard1.getValue() + dCard2.getValue();
		System.out.println(dCard1 +"\nCard value is: " + dCard1.getValue());
		
		
		int blackjack = 21;
		
		if(playHand.isBlackjack(playerCount) && dealHand.isBlackjack(dealerCount)){
			System.out.println("Both BlackJack, push");
		}
		else if(playHand.isBlackjack(playerCount) && dealHand.isBlackjack(dealerCount)) {
			System.out.println("winner, winner chicken dinner!");
			
		}
		else if(playHand.isBlackjack(playerCount) && dealHand.isBlackjack(dealerCount)) {
			System.out.println("Dealer wins");
		}
		else {
			while (playerCount < blackjack) {
				playerCount += player(pCard1, pCard2, deck, kb);
				System.out.println(playerCount);
			}
		}
		
//		pHand.isBust(playerCount);
//		
////		if(playerCount > 21) {
////			
////		}
		
		
	}
	
	public int player(Card pCard1, Card pCard2 , Deck deck, Scanner kb) {
		/*
		 * Will check value of cards and display
		 * cards/value with option to hit/stay
		 * 
		 * Can add another card to hand (hit)
		 * If added card makes total greater than 21
		 * then player bust and loses automatically
		 * 
		 * Can stay with current hand value
		 * If stay then move to dealer/next player
		 * move
		 * 
		 * return card value
		 */
		int playerCount = 0;
		System.out.println("would you like to hit or stay? (H or S)");
		String hitOrStay = kb.nextLine();
		if(hitOrStay.endsWith("H")) {
			Card playerCard = deck.dealCard();
			playerCount = playerCard.getValue();
			System.out.println(playerCard);
			return playerCount;
			
		}
		else {
			return playerCount;
		}
		
	}
	
	public void dealer() {
		
		/*While less than 17
		 * The dealers decisions are fix logic
		 * If card total is greater than or 17, stay
		 * If card total is less than 17, hit
		 * If hit, add card and total to hand
		 * 
		 * return card value
		 */
	}

}
