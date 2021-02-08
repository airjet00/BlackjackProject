package com.skilldistillery.blackjack;


import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.cards.*;

public class BlackjackApplication {

	private BlackjackHand playHand = new BlackjackHand();
	private BlackjackHand dealHand = new BlackjackHand();
	private int blackjack = 21;
	Scanner kb = new Scanner(System.in);
	

	public static void main(String[] args) {
		BlackjackApplication bja = new BlackjackApplication();
		
		bja.play();
		
		
	}

	private void play() {
		
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
		boolean playAgain = true;
		while(playAgain) {
		
			int playerCount, dealerCount;
			Deck deck = new Deck();
		
			System.out.println(deck.checkDeckSize());
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

			System.out.println(deck.checkDeckSize());
	
			System.out.println();
		
			System.out.println("----------------");
			System.out.println("| Dealer Cards |");
			System.out.println("----------------");
		
			dealerCount = dCard1.getValue() + dCard2.getValue();
			System.out.println(dCard1 +"\nCard value is: " + dCard1.getValue());
		

			boolean isNotBlackjack = false;
			while(!isNotBlackjack) {
		
				if(playHand.isBlackjack(playerCount) && dealHand.isBlackjack(dealerCount)){
					System.out.println("Both BlackJack, push");
					isNotBlackjack = playAnother();
					
				}
				else if(playHand.isBlackjack(playerCount) && dealHand.isBlackjack(dealerCount)) {
					System.out.println("winner, winner chicken dinner!");
					isNotBlackjack = playAnother();
				}
				else if(playHand.isBlackjack(playerCount) && dealHand.isBlackjack(dealerCount)) {
					System.out.println("Dealer wins");
					isNotBlackjack = playAnother();
				}
				else {
					isNotBlackjack = !playHand.isBlackjack(playerCount);	
					System.out.println();
					}
				}
			playerCount = player(pCard1, pCard2, deck, playerCount);
			System.out.println(playerCount);
			if(playHand.isBust(playerCount)) {
				
				playAgain = playAnother();
			}
			
			System.out.println("\nDealer Shows:");
			System.out.println(dCard1.toString() + "\n"
								+dCard2.toString());
			dealerCount = dealer(dCard1, dCard2, deck, dealerCount);
			if(dealHand.isBust(dealerCount)) {
				System.out.println("Dealer Bust, YOU WIN");
				playAgain = playAnother();
			}
			else {
				if(playerCount > dealerCount) {
					System.out.println("YOU WIN");
					playAgain = playAnother();
				}
				else if(playerCount < dealerCount) {
					System.out.println("YOU LOSE");
					playAgain = playAnother();
				}
				else if (playerCount == dealerCount) {
					System.out.println("PUSH (tie)");
					playAgain = playAnother();
				}
				else {
					System.out.println("Broken");
				}
			}
		}
		//System.out.println("Thank you for playing");
//		pHand.isBust(playerCount);
//		
////		if(playerCount > 21) {
////			
////		}
		
	
	}
	public boolean playAnother() {
		System.out.println("\nWould you like to play again? Y or N");
		String play = kb.next();
		String plays = play.toUpperCase();
		if (plays.equals("Y")) {
			playHand.clear();
			dealHand.clear();
			play();
		}
		else {
			System.out.println("Thank you for playing");
		}
		
		return false;
		
		
	}
	
	public int player(Card pCard1, Card pCard2 , Deck deck, int playerCount) {
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
		
		System.out.println("would you like to hit or stay? (H or S)");
		String hitOrStay = kb.next();
		kb.nextLine();
		if(hitOrStay.equals("H")) {
			Card playerCard = deck.dealCard();
			playerCount += playerCard.getValue();
			System.out.println(pCard1.toString() + "\n" 
						+ pCard2.toString() + "\n" +playerCard.toString());
			
			if(playerCount < blackjack) {
				System.out.println("Cards value is: " + playerCount);
				playerCount = player(pCard1, pCard2, deck, playerCount);
			}
			return playerCount;
			
		}
		else {
			return playerCount;
		}
		
	}
	
	public int dealer(Card dCard1, Card dCard2 , Deck deck, int dealerCount) {
		int dealerHit = 17;
		/*While less than 17
		 * The dealers decisions are fix logic
		 * If card total is greater than or 17, stay
		 * If card total is less than 17, hit
		 * If hit, add card and total to hand
		 * 
		 * return card value
		 */
		while(dealerCount < dealerHit) {
			Card dealerCard = deck.dealCard();
			dealerCount += dealerCard.getValue();
			System.out.println();
			System.out.println("Dealer now has: ");
			System.out.println(dCard1.toString()+ "\n"
							+ dCard2.toString() + "\n"
							+ dealerCard.toString());
			System.out.println();
			System.out.println("Dealer cards value is: " + dealerCount);
//			if(dealHand.isBust(dealerCount)) {
//				System.out.println("Dealer Bust");
//				return dealerCount;
//			}
		}
		
		return dealerCount;
	}
	
	public void winner(int playerCount, int dealerCount) {
		
	}
	
	
}
